package za.co.protogen.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import za.co.protogen.dto.UserRequest;
import za.co.protogen.dto.UserResponse;
import za.co.protogen.model.User;
import za.co.protogen.repository.UsersRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserService {

    private final UsersRepository userRepository;

    public  void addUser(UserRequest userRequest){
        User user = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .rsaId(userRequest.getRsaId())
                .dateOfBirth(userRequest.getDateOfBirth())
                .build();

        userRepository.save(user);

        log.info("User {} is saved", user.getId());

    }

    public List<UserResponse> getAllUsers() {
        List<User> cars = userRepository.findAll();

        return cars.stream().map(this::mapToUsersResponse).collect(Collectors.toList());
    }

    private UserResponse mapToUsersResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .dateOfBirth(user.getDateOfBirth())
                .rsaId(user.getRsaId())
                .lastName(user.getLastName())
                .build();

    }

    public void removeUser(Long id) {
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            log.info("User with ID {} has been Removed", id);
        }else{
            log.warn("User with ID {} not found and cannot be Removed", id);
        }

    }

    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }


    public void updateUser(Long userId, UserRequest userRequest) throws UserNotFoundException {
        // First, check if the user with the given ID exists.
        Optional<User> optionalCar = userRepository.findById(userId);
        if (optionalCar.isPresent()) {
            User user = optionalCar.get();

            // Update the user's attributes with the new values from the request.
            user.setDateOfBirth(userRequest.getDateOfBirth());
            user.setRsaId(userRequest.getRsaId());
            user.setFirstName(userRequest.getFirstName());
            user.setLastName(userRequest.getLastName());


            // Save the updated user.
            userRepository.save(user);

            log.info("User {} is updated", user.getId());
        } else {
            // Handle the case where the user with the given ID doesn't exist.
            throw new UserNotFoundException("Car with ID " + userId + " not found");
        }
    }
}

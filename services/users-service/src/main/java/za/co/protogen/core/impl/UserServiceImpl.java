package za.co.protogen.core.impl;

import org.springframework.stereotype.Service;
import za.co.protogen.core.UserService;
import za.co.protogen.domain.User;
import za.co.protogen.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void removeUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User updateUser(Long userId, User updatedUser) {
        User user = getUserById(userId);
        if (user != null) {
            updatedUser.setId(userId);
            return userRepository.save(updatedUser);
        }
        return null;
    }

    @Override
    public List<User> searchUsers(String firstName, String lastName, String rsaId) {
        return userRepository.findUsersByFirstNameAndLastNameAndRsaId(firstName, lastName, rsaId);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}

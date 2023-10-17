package za.co.protogen.core;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.protogen.domain.User;

import java.util.List;
@FeignClient(name = "users-service")
public interface UserService {
    @GetMapping("/users")
    void addUser(User user);
    void removeUser(Long userId);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(Long userId, User updatedUser);
    List<User> searchUsers(String firstName, String lastName, String rsaId);

    User createUser(User user);

    void deleteUser(Long userId);
}

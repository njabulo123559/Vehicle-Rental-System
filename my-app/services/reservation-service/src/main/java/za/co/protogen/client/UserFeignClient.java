package za.co.protogen.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import za.co.protogen.model.User;

@FeignClient(name = "users-service")
public interface UserFeignClient {
    @GetMapping("/api/users/{id}")
    User getUserById(@PathVariable("id") Long userId);
}

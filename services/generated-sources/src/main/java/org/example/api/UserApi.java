package org.example.api;

import org.example.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Api(value = "User")
public interface UserApi {

    @ApiOperation(value = "Get a list of users")
    @GetMapping("/users")
    List<User> getUsers();
}

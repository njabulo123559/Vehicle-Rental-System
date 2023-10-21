package za.co.protogen.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.protogen.dto.UserRequest;
import za.co.protogen.dto.UserResponse;
import za.co.protogen.model.User;
import za.co.protogen.service.UserNotFoundException;
import za.co.protogen.service.UserService;

import java.util.List;

@Api(value = "User Management API", tags = "Users")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @ApiOperation(value = "Add a new user")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addUser(@RequestBody List<UserRequest> userRequests){
        for (UserRequest userRequest1 : userRequests){
            userService.addUser(userRequest1);
        }
        return "User Added Successfully";
    }

    @ApiOperation(value = "Get a list of all users")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getAllUsers(){
        return  userService.getAllUsers();
    }

    @ApiOperation(value = "Remove a user by ID")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String removeUser(@PathVariable Long id){
        userService.removeUser(id);
        return "User Removed Successfully";
    }

    @ApiOperation(value = "Get a user by ID")
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        if(userService.getUserById(id) != null){
            return ResponseEntity.ok(userService.getUserById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "Update a user by ID")
    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public String updateUser(@PathVariable Long userId, @RequestBody UserRequest userRequest) throws UserNotFoundException {
        userService.updateUser(userId, userRequest);
        return "User Updated Successfully";
    }
}

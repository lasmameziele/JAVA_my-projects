package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired // Use constructor-based dependency injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add") // localhost:8080/user/add
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @GetMapping("/get") // localhost:8080/user/get
    public List<User> get() {
        return userService.get();
    }

    @PostMapping("/update") // localhost:8080/user/update
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}

package com.dgn.jpa_part_3_jpql.controller;

import com.dgn.jpa_part_3_jpql.dto.UserCountDto;
import com.dgn.jpa_part_3_jpql.model.User;
import com.dgn.jpa_part_3_jpql.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }
    @GetMapping("/getUserNameCount")
    public ResponseEntity<List<UserCountDto>> getUserNameCount(){
        return new ResponseEntity<>(userService.getUserNameCount(),HttpStatus.OK);
    }
}

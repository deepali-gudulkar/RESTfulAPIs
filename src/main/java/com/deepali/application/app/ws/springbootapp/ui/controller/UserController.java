package com.deepali.application.app.ws.springbootapp.ui.controller;

import com.deepali.application.app.ws.springbootapp.ui.model.response.UserRest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "limit", defaultValue = "25") int limit) {
        return "getUsers is called with page " + page + " and limit " + limit;
    }

    @GetMapping(path = "/{userId}")
    public UserRest getUser(@PathVariable String userId) {

        UserRest userRest = new UserRest();
        userRest.setFirstName("Deepali");
        userRest.setLastName("Gudulkar");
        userRest.setEmailAddress("deepali.gudulkar@outlook.com");
        userRest.setUserId("deepali25");

        return userRest;
    }

    @PostMapping
    public String createUser() {
        return "createUser is called";
    }

    @PutMapping
    public String updateUser() {
        return "updateUser is called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "deleteUser is called";
    }

}
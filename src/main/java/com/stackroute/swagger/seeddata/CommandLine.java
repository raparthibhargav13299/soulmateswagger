package com.stackroute.swagger.seeddata;

import com.stackroute.swagger.model.User;
import com.stackroute.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {
    @Autowired
    private UserService userService;

    public CommandLine(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        userService.saveUser(new User("john","gen",20,"male"));
    }
}

//package com.stackroute.swagger.seeddata;
//
//import com.stackroute.swagger.model.User;
//import com.stackroute.swagger.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Application implements ApplicationRunner {
//
//    @Autowired
//    private UserService userService;
//
//    public Application(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        userService.saveUser(new User("com","sen",20,"male"));
//
//    }
//}

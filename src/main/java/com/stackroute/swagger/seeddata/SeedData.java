package com.stackroute.swagger.seeddata;

import com.stackroute.swagger.model.User;
import com.stackroute.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;






    @Component
    public class SeedData  implements  ApplicationListener<ContextRefreshedEvent> {

          @Autowired
            private UserService userService;


        public SeedData(UserService userService) {
            this.userService = userService;
        }

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {
            userService.saveUser(new User("com","sen",20,"male"));
        }
    }

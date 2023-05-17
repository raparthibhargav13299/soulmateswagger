package com.stackroute.swagger.contoller;

import com.stackroute.swagger.model.User;
import com.stackroute.swagger.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("api/v1")
public class UserController {
private UserService userService;


//private static final Logger logger =  LoggerFactory.getLogger(UserController.class);


@GetMapping("/message")
public String getMessage() {
    log.info("this is info message");
log.debug("this is debug message");
log.trace("this is trace message");
log.warn("this is warn message");
log.error("this is error message");
return "message";
}
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public ResponseEntity<List<User>>getAllUsers() {
        return new ResponseEntity<List<User>>((List<User>)userService.getAllUsers(),HttpStatus.OK);

    }

    @GetMapping("/profile/gender")
    public ResponseEntity <List<User>> searchUserByGender(String gender)
    {
        return new ResponseEntity<List<User>>((List<User>)userService.searchUserByGender(gender),HttpStatus.OK);


    }

    @GetMapping("/post/firstname")
    public ResponseEntity <List<User>> SearchUserByname(String firstname)
    {
        return new ResponseEntity<List<User>>((List<User>)userService.searchUserByName(firstname),HttpStatus.OK);


    }


    @GetMapping("/user/age")
    public ResponseEntity <List<User>> SearchUserByage(int age)
    {
        return new ResponseEntity<List<User>>((List<User>)userService.searchUserByAge(age),HttpStatus.OK);


    }







@PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
    User savedUser=userService.saveUser(user);
    return new ResponseEntity<>(savedUser, HttpStatus.CREATED);

}

    @PutMapping("/userss/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody User user) throws Exception {
        user.setId(id);
        return ResponseEntity.ok().body(this.userService.updateUser(user));
    }
    @DeleteMapping("/usersss/{id}")
    public HttpStatus deleteUser(@PathVariable int id) throws Exception {
        this.userService.deleteUser(id);
        return HttpStatus.OK;
    }




}

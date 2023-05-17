package com.stackroute.swagger.service;

import com.stackroute.swagger.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user );
    List<User> getAllUsers();
    public void deleteUser(int id) throws Exception;
    User updateUser(User user) throws Exception;

    List<User> searchUserByGender(String gender);
    List<User> searchUserByName(String firstname);
    List<User> searchUserByAge(int age);

}

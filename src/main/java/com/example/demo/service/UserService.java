package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.api.model.User;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User u1 = new User(1, "Esteban1", 21, "micorreo1@gmail.com");
        User u2 = new User(2, "Esteban2", 22, "micorreo2@gmail.com");
        User u3 = new User(3, "Esteban3", 23, "micorreo3@gmail.com");
        User u4 = new User(4, "Esteban4", 24, "micorreo4@gmail.com");
        User u5 = new User(5, "Esteban5", 25, "micorreo5@gmail.com");

        userList.addAll(Arrays.asList(u1,u2,u3,u4,u5));
    }

    public User getUser(Integer id){
        return userList.get(id-1);
    }

}

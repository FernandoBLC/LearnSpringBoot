package com.example.learnspringboot.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
// THIS IS THE SERVICE FILE
// This is the service file
// The service file is the site where we have
// function like a sequelize findOne or findAll
@Component
public class UserDaoService {
    public static int usersCount = 5;
    private static List<User> users = new ArrayList<>();

    static
    {
        users.add(new User(1, "John", new Date()));
        users.add(new User(2, "Robert", new Date()));
        users.add(new User(3, "Adam", new Date()));
        users.add(new User(4, "Andrew", new Date()));
        users.add(new User(5, "Jack", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++usersCount);
        user.setDob(new Date());

        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for(User user: users){
            if(user.getId() ==  id){
                return user;
            }
        }
        return null;
    }
}

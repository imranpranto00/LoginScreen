package com.imrapranto.demov3.services;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Simple mock authentication (in real scenarios, integrate with a database)
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password".equals(password);
    }
}


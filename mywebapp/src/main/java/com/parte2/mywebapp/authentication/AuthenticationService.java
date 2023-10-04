package com.parte2.mywebapp.authentication;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isUser = username.equalsIgnoreCase("Magno");
        boolean isPassword = password.equalsIgnoreCase("1234");
        return isPassword && isUser;
    }
}

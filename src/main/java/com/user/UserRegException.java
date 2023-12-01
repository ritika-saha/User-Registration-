package com.user;

public class UserRegException extends Exception {


    String message;
    public UserRegException(String s){
        this.message=s;
        
    }

    public String getMessage(){
        return message;
    }
}

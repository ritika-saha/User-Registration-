package com.user;

public class UserRegException extends Exception {
    //public MoodAnalyserErr err;
//
    //public MoodAnalyserException(MoodAnalyserErr e) {
    //    super(e.getMessage());
    //    this.err = e;
    //}
//
    //public MoodAnalyserErr getError(){
    //    return err;
    //}

    String message;
    public UserRegException(String s){
        this.message=s;
        
    }

    public String getMessage(){
        return message;
    }
}

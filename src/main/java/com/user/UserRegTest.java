package com.user;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegTest {

    public boolean validateFirstName(String data){
        final String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        boolean result=matcher.matches();
        return result;
    }

     public boolean validateLastName(String data){
        return validateFirstName(data);
    }

    public boolean validateEmail(String data){
        final String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(data);
        boolean result=matcher.matches();
        return result;
    }
    
    
}

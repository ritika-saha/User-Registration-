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
        final String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(data);
        boolean result=matcher.matches();
        return result;
    }

    public boolean validatePhone(String data){
        final String phoneRegex="^91 [1-9]\\d{9}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(data);
        boolean result=matcher.matches();
        return result;
    }

    public boolean validatePassword(String data){
        final String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-_+=])[A-Za-z\\d]*[!@#$%^&*()-_+=][A-Za-z\\d!@#$%^&*()-_+=]{7,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(data.trim());
        boolean result=matcher.matches();
        return result;
    }
    
    
}

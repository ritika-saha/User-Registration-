package com.user;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegTest {

    public boolean validateFirstName(String data) throws UserRegException{
        final String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(data);
        boolean result=matcher.matches();
        try {
            if (result)
                return result;
            else
                throw new UserRegException("Invalid Name Data ---");
        } catch (Exception e) {
            throw e;
        }
    }

     public boolean validateLastName(String data) throws UserRegException{
        return validateFirstName(data);
    }

    public boolean validateEmail(String data) throws UserRegException{
        final String emailRegex = "^[a-zA-Z0-9.$&%_+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+$";
        Pattern pattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
         Matcher matcher = pattern.matcher(data);
        boolean result=matcher.matches();
        try {
            if (result)
                return result;
            else
                throw new UserRegException("Invalid Email Data ---");
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean validatePhone(String data) throws UserRegException{
        final String phoneRegex="^91 [1-9]\\d{9}$";
        Pattern pattern = Pattern.compile(phoneRegex);
         Matcher matcher = pattern.matcher(data);
        boolean result=matcher.matches();

        try {
            if (result)
                return result;
            else
                throw new UserRegException("Invalid Phone-Number Data ---");
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean validatePassword(String data) throws UserRegException{
        final String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
         Matcher matcher = pattern.matcher(data.trim());
        boolean result=matcher.matches();
        try {
            if (result)
                return result;
            else
                throw new UserRegException("Invalid Password Data ---");
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}

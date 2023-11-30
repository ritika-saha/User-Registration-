package com.user;
import java.util.Scanner;

public class UserRegMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        Scanner sc=new Scanner(System.in);

        UserRegTest testData=new UserRegTest();

        //Validating first name
        System.out.println("Enter First Name");
        String fname=sc.nextLine();
        boolean isValid=testData.validateFirstName(fname);
        System.out.println(isValid?"First Name - VALID":"First Name -  INVALID");

        //validating last name
        System.out.println("Enter Last Name");
        String lname=sc.nextLine();
        isValid=testData.validateFirstName(lname);
        System.out.println(isValid?"Last Name - VALID":"Last Name -  INVALID");

        //validating email
        System.out.println("Enter user's Email");
        String email=sc.nextLine();
        isValid=testData.validateEmail(email);
        System.out.println(isValid?"Email - VALID":"Email -  INVALID");

        //validating Phone Number
        System.out.println("Enter user's Phone Number");
        String phone=sc.nextLine();
        isValid=testData.validatePhone(phone);
        System.out.println(isValid?"Phone Number - VALID":"Phone Number -  INVALID");


        //validating password
        System.out.println("Enter User's Password");
        String password=sc.nextLine();
         isValid=testData.validatePassword(password);
        System.out.println(isValid?"Password - VALID":"Password -  INVALID");

        //validating given emails
        String[] emails = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc+100@gmail.com",
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
        };

        for(String e:emails){
            isValid=testData.validateEmail(e);
            System.out.print(e);
            System.out.println(isValid?" \t---- Email - VALID":" --- Email -  INVALID");
        }


        sc.close();
        
    }
}
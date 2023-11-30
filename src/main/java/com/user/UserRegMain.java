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





        sc.close();
        
    }
}
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
        
    }
}
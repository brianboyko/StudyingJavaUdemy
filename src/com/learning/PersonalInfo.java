package com.learning;

import java.util.Scanner;

public class PersonalInfo {

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in); // Creates an object from the scanner class.  

    System.out.println("Enter your first name.");
    String firstName = input.next();
    System.out.println("Enter your last name.");
    String lastName = input.next();
    System.out.println("Enter your age.");
    int age = input.nextInt();
    System.out.println("Enter your birthdate.");
    String birthdate = input.next();
    System.out.println("Enter your location.");
    String location = input.next();
    
    
    System.out.println("You are " + firstName + " " + lastName + ".");
    System.out.println("You are " + age + " years old");
    System.out.println("Your birth date is: " + birthdate);
    System.out.println("And you are currently in: " + location);
  }
  
}

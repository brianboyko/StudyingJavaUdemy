package com.learning;

import java.util.Scanner;

public class NumberManipulation {

  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in); // Creates an object from the scanner class.  

    System.out.println("Input the first number");
    int a = input.nextInt();
    System.out.println("Input the second number"); 
    int b = input.nextInt(); 
    System.out.println("Input the third number"); 
    int c = input.nextInt(); 
    
    int mult = a * b; 
    if (mult % c == 0){
      System.out.println("Result (int): " + (mult/c));
    } else {
      double dbl = ((double) mult/c);
      System.out.println("Result (double): " + dbl); 
    }
  }
  
}

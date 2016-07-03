package com.learning;

import java.util.Scanner;

public class FeetToMeters {
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("How many feet?");
    double feet = input.nextDouble();
    double meters = feet * 0.305;
    System.out.println("That's " + meters + " meters");
    
    
  }

}

package com.learning;

import java.util.Scanner;

public class CelciusToFahrenheit {
  
  public static void main (String[] args){
    
    Scanner input = new Scanner(System.in); 
    
    System.out.println("Enter degrees in Celsius"); 
    
    double celc = input.nextDouble();
    
    double fahr = (((double) 9/5 ) * celc) + 32 ; 
    
    System.out.println("That's equal to " + fahr + " degrees in American Freedom Units!");
    
  }

}

package com.learning;

import java.util.Scanner;

public class Fizzbuzz {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Entery your fizzbuzz number");
    int count = input.nextInt();
    
    for(int i = 1; i <= count; i++){
      if(i % 15 == 0){
        System.out.println("Fizzbuzz!");
      } else if ( i % 5 == 0 ) {
        System.out.println("Buzz"); 
      } else if ( i % 3 == 0 ) {
        System.out.println("Fizz");
      } else {
        System.out.println(i); 
      }
    }
    
  }

}

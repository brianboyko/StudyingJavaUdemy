package com.learning;

import java.util.Random;

public class SimpleClass {

  public int a = 0; // acess via [instanceVariableName].a
  public int i = 1; 
  public int doublea = 0;
  public int doublei = 0; 
  public static int r = 10; // access via SimpleClass.r OR [instanceVariableName].r
  public final int constantInt = 100; // cannot be changed. 
  
  public SimpleClass() {
    // defines the constructor;
    System.out.println("Hello");
  }
  
  public SimpleClass(int c, int d) {
    // defines the constructor;
    System.out.println("Constructor is running");
    this.a = c;
    this.i = d;
    this.doublea = c * 2;
    this.doublei = d * 2;
  
  }
  // this is a method, not a function???
  public void printSomething(){
    System.out.println("Print Something!");
  }
  
  public void printWord(String word){
    System.out.println(word);
  }
  
  public int returnSomething(){
    return 2;
  }
  
  public int calculate(int a, int b){
    return a * b;
  }
  
  public static String knuthShuffler(String source){
    String[] sourceArray = source.split("(?!^)");
    System.out.println(String.join("", sourceArray));
    String temp;
    int randInd;
    Random randGen = new Random(); 
    for(int i = 0; i < sourceArray.length; i++){
      temp = sourceArray[i]; 
      randInd = randGen.nextInt(sourceArray.length);
      sourceArray[i] = sourceArray[randInd]; 
      sourceArray[randInd] = temp; 
    }
    return String.join("", sourceArray);
    
  }
  
  public static void main(String[] args){
    
    System.out.println("Runs before constructor");
    SimpleClass ourClass = new SimpleClass(4, 7); 
    SimpleClass secondClass = new SimpleClass();
    System.out.println("Runs after constructor");
    System.out.println("ourClass.a: " + ourClass.a + " ourClass.doublea: " + ourClass.doublea);
    System.out.println("ourClass.i: " + ourClass.i + " ourClass.doublei: " + ourClass.doublei);
    System.out.println("This is static to the class: r = " + SimpleClass.r);
    ourClass.printSomething();
    ourClass.printWord("yadda yada");
    System.out.println(ourClass.returnSomething());
    System.out.println(ourClass.calculate(4,  5)); 
    System.out.println("instance shuffler");
    System.out.println("final " + ourClass.knuthShuffler("alphabet"));
    System.out.println("class (static) shuffler");
    System.out.println("final " + SimpleClass.knuthShuffler("alphabet"));

  }
  
}

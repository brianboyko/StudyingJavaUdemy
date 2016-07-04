package com.learning;

public class SimpleClass {

  public int a = 0;
  public int i = 1; 
  public int doublea = 0;
  public int doublei = 0; 
  
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
  
  public static void main(String[] args){
    
    System.out.println("Runs before constructor");
    SimpleClass ourClass = new SimpleClass(4, 7); 
    SimpleClass secondClass = new SimpleClass();
    System.out.println("Runs after constructor");
    System.out.println("ourClass.a: " + ourClass.a + " ourClass.doublea: " + ourClass.doublea);
    System.out.println("ourClass.i: " + ourClass.i + " ourClass.doublei: " + ourClass.doublei);

    
  }
  
}

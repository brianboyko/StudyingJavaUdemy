package com.learning;

public class PassObjectsAsParametersToMethods {
  
  public int a = 0;
  public int b = 0;
  
  public PassObjectsAsParametersToMethods(){
    
  }
  
  public void method(PassObjectsAsParametersToMethods obj){
    obj.a = 10;
    System.out.println(obj.a);
  }

  public static void main(String[] args) {
    PassObjectsAsParametersToMethods thisClass = new PassObjectsAsParametersToMethods();
    thisClass.method(thisClass);
  }
  
}

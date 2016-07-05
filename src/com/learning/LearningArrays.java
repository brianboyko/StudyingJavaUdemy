package com.learning;

public class LearningArrays {
  
  public LearningArrays(){
    
  }
  
  public void squareAll(int[] data){
    for(int i = 0; i < data.length; i++){
      System.out.println(data[i] * data[i]);
    }
  }
  
  public static void main(String[] args){
    
    int[] data = new int[15];
    // arrays are fixed size.
    // and can only take one type of data.
    System.out.println(data.length); //=> 15
    // data.length is fixed at instantion time, not the number of fixed elements..
    
    int[] data2 = {1, 2, 3, 4, 5}; // very different from JS. 
    for(int i = 0; i < data2.length; i++){
      System.out.println(data2[i]);
    } // ==> 
    /* 1
     * 2
     * 3
     * 4
     * 5
     */
    for(int item : data2){ // similar to "for(var item of data)" in JS
      System.out.println(item * 2);
    }// ==> 
    /* 2
     * 4
     * 6
     * 8
     * 10
     */
     // again, you can't just call the method, you have to create an object. 
     LearningArrays la = new LearningArrays();
     la.squareAll(data2);
     // ==> 
     /* 1
      * 4
      * 9
      * 16
      * 25
      */
  }

}

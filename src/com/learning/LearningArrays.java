package com.learning;

import java.util.Arrays;
import java.util.Random;

public class LearningArrays {
  
  public LearningArrays(){
    
  }
  
  public void squareAll(int[] data){
    for(int i = 0; i < data.length; i++){
      System.out.println(data[i] * data[i]);
    }
  }
  
  public int[] genRandom(int... data){ // unusual but valid array syntax equal to int[]; 
    Random random = new Random();
    for(int i = 0; i < data.length; i++){
      data[i] = random.nextInt(100);
    }
    return data;
  }
  
  public int[] sortArray(int[] data){
    Arrays.sort(data);
    return data;
  }
  
  public static void binarySearch(int[] data){
    for(int i = 0; i < data.length; i++){
      data[i] = i; 
    }
    System.out.println(Arrays.binarySearch(data,  900));
  }
  
  
  public static void main(String[] args){
    
    int[] data = new int[15];
//    // arrays are fixed size.
//    // and can only take one type of data.
//    System.out.println(data.length); //=> 15
//    // data.length is fixed at instantion time, not the number of fixed elements..
//    
//    int[] data2 = {1, 2, 3, 4, 5}; // very different from JS. 
//    for(int i = 0; i < data2.length; i++){
//      System.out.println(data2[i]);
//    } // ==> 1, 2, 3, 4, 5
//
//    for(int item : data2){ // similar to "for(var item of data)" in JS
//      System.out.println(item * 2);
//    }// ==> 2, 4, 6, 8, 10
//     // again, you can't just call the method, you have to create an object. 
//     LearningArrays la = new LearningArrays();
//     la.squareAll(data2);
//     // ==> 1, 4, 9, 16, 25
//     
//     int[] bingo = new int[10];
//     bingo = la.genRandom(bingo);
//     bingo = la.sortArray(bingo);
//     System.out.println("XXX");
//     for (int item : bingo){
//       System.out.println(item);
//     }

    LearningArrays la = new LearningArrays();
    la.binarySearch(data); 
    
  }

}

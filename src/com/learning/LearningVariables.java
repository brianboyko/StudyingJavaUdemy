package com.learning;

// was added by quick-fix in Eclipse.
import java.util.Scanner;

public class LearningVariables {
  
  public static void main(String[] args){
    
    long currentMilliseconds = System.currentTimeMillis();
    long totalSeconds = currentMilliseconds = currentMilliseconds / 1000;
    long currentSecond = totalSeconds % 60; 
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHour = totalHours % 24;
    
    System.out.println((currentHour - 5 ) + ":" + currentMinute + ":" + currentSecond);
  }

}

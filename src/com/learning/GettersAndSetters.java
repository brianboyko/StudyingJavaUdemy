package com.learning;

public class GettersAndSetters {
  
  private int score = 0;
  private int highScore = 0;
  
  public GettersAndSetters() {
    
  }
  
  public void setScore(int score){
    this.score = score;
    if (score > highScore){
      this.highScore = score;
    }
  }
  
  public int getScore(){
    return this.score;
  }
  
  public int getHighScore(){
    return this.highScore;
  }
  
  public static void main(String[] args){
    
  }

}

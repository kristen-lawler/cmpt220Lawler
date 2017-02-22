/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This file calculates the largest integer n such that the integer cubed
   *is less than 12000
   */
public class Lab5_13{
  public static void main(String[] args){

    //We begin testing integers at 0
    int n = 0;

    /*We will use a while loop to iterate up through the integers until 
    we find the desired number*/
    while(true){
      if(Math.pow(n,3) < 12000){
        n++;
      } 
      else{
        n--;
        break;
      }
    }
    System.out.print(n);
  }
}
/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This file outputs the the smallest possible integer such that
   * the integer squared is less than 12000.
   */
public class Lab5_12{
  public static void main(String[] args){

    /*We will begin out iterations at zero and decrements to find the smallest
    that satisfies our desired requirement*/
    int n = 0;

    while(true){
      if(n*n <= 12000){
        n--;
      } 
      else { 
        n++;
        break;
      }
    }  
      System.out.print(n);
  }
}
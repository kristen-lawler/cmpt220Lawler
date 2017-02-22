/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This file contains a method that will sum the digits of an integer.
   */

public class Lab6_2{
  public static long sumDigits(long n){
    long sum = 0;
    while(n > 0){
      sum = sum + n % 10; 
      n = n / 10;
    }
    return sum;
  }

  //This section can be used the test the above function if it is uncommented
  /*public static void main(String[] args){
   long x = sumDigits(9999);
   System.out.println(x);
   }*/
}

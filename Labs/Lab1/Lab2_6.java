/* *
   * file: Lab2_6.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file calculates the sum of all digits of the number inputed
   */
import java.util.Scanner;

public class Lab2_6{
  public static void main(String[] args){
    //Creating a scanner
    Scanner input = new Scanner(System.in);

    //Receiving the number between 0 and 1000
    System.out.println("Please enter an integer between 0 and 1000.");
    int number = input.nextInt();

    //Breaking down the input into its integers
    int x = number % 1000;
    int y = x % 100;
    int z = y % 10;
    
    //Extracting each and every digit
    int q = (number - x) / 1000;
    int r = (x - y) / 100;
    int s = (y - z) / 10;

    //Calculating the sum of all digits
    int sum = z + q + r + s; 

    //Outputting the sum of all digits
    System.out.println("The sum of the digits is " + sum + "."); 
  }
}
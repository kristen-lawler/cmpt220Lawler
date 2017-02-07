/* *
   * file: Lab3_8.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file asks for the user to input 3 integers. It then outputs those 
   * numbers in non-descreasing order.
   */
import java.util.Scanner;

public class Lab3_8{
  public static void main(String[] args){
    //Creating the scanner
    Scanner input = new Scanner(System.in);

    //Getting the user's first integer
    System.out.println("Please enter your first of three integer:");
    int first = input.nextInt();

    //Getting the user's second integer
    System.out.println("Please enter your second of three integer:");
    int second = input.nextInt();

    //Getting the user's third integer
    System.out.println("Please enter your third and final integer:");
    int third = input.nextInt();

    //Constructing output to be in non-decreasing order
    if(second > third)
      System.out.println(" " + first + " " + third + " " + second + " ");
    else if(second == third)
      System.out.print(" " + second + " " + first + " " + third + " ");
    else 
      System.out.print("" + first + " " + second + " " + third + " "); 
  }
}
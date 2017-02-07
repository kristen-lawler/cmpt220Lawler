/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file receives an integer input from the user between 0 and 127.
   * It then outputs the associated ASCII character.
   */
import java.util.Scanner;

public class Lab4_8{
  public static void main(String[] args){
    //Create the scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to input a number from 0 to 127
    System.out.println("Please input a number between 0 and 127:");
    int s = input.nextInt();
    
    //Converting the integer into its associated character
    char ch = (char)s;

    //Outputting the correct character
    System.out.println(ch);
  }
}
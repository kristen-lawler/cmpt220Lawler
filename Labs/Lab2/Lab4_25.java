/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file uses ASCII code values in decimal to generate
   * license plate numbers
   */
public class Lab4_25{
  public static void main(String[] args){
    
    //Generating random capital letters and digits for the liscence plate
    int letter1 = (int)(Math.random() * 26 ) + 65;
    int letter2 = (int)(Math.random() * 26) + 65;
    int letter3 = (int)(Math.random() * 26) + 65;
    int digit1 = (int)(Math.random() * 10) + 48;
    int digit2 = (int)(Math.random() * 10) + 48;
    int digit3 = (int)(Math.random() * 10) + 48;
    int digit4 = (int)(Math.random() * 10) + 48;

    //Converting integer input to appropriate ASCII character
    char l1 = (char)letter1;
    char l2 = (char)letter2;
    char l3 = (char)letter3;
    char d1 = (char)digit1;
    char d2 = (char)digit2;
    char d3 = (char)digit3;
    char d4 = (char)digit4;

    //Outputting the generated liscence plate number
    System.out.println("Your plate number is:" + l1 + l2 + l3 + d1 + d2 + d3 + d4 + ".");

  }
}
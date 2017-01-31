/* *
   * file: Lab2_5.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file calculates the grtatuity and total based upon a 
   * subtotal and a decided rate of gratuity inputed by the user
   */
import java.util.Scanner;

public class Lab2_5{
  public static void main(String[] args){
    //Creating a scanner
    Scanner input = new Scanner(System.in);

    //Receiving the subtotal and gratuity amounts
    System.out.println("Please enter the subtotal.");
    double subtotal = input.nextDouble();
    System.out.println("Please enter the gratuity rate.");
    double gratuity = input.nextDouble();

    //Calculating the gratuity and total
    gratuity = subtotal * (gratuity / 100.00);
    double total = subtotal + gratuity;

    //Output of the calculated gratuity and total
    System.out.println("The gratuity is " + gratuity + 
        " and the total is " + total + "."); 
  }
}
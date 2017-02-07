/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file asks for the user to input an amount of money. It then
   * breaks up that input into the dollar amount and remaining change as strings
   * to fix any poosible loss of accuracy. Finally, it outputs the change 
   * in quarters, dimes, nickels, and pennies.
   */
import java.util.Scanner;

public class Lab4_26{
  public static void main(String[] args){
    //Create scanner
    Scanner input = new Scanner(System.in);

    //Receive the amount
    System.out.println("Enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();

    /*Break up the input into a string for the dollar amount and
    * a string for the change */
    String dollars = amount.substring(0 , amount.indexOf("."));
    String cents = amount.substring(amount.indexOf(".") + 1, amount.length());

    //Convert each string to an integer
    int numberOfDollars = Integer.parseInt(dollars);
    int remainingAmount = Integer.parseInt(cents);

    //Find  the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    //Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    //Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    //Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    //Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("    " + numberOfDollars + " dollars");
    System.out.println("    " + numberOfQuarters + " quarters");
    System.out.println("    " + numberOfDimes + " dimes");
    System.out.println("    " + numberOfNickels + " nickels");
    System.out.println("    " + numberOfPennies + " pennies");
    
  }
}
    
    
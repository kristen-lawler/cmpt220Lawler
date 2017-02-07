/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file generates a random 3 digit lottery number and asks for a 
   * user to select their own three digit lottery number. It then compares
   * the two and determines the user's prize.
   */
import java.util.Scanner;

public class Lab3_15 {
  public static void main(String[] args){
    //Generate a lottery number
    int lottery = (int)(Math.random()*1000);

    //Seperating the lottery number into 3 digits
    int lottery1 = (lottery  / 100) - ((lottery % 100)/100);
    int lottery2 = ((lottery % 100)/10) - (((lottery % 100) % 10)/10);
    int lottery3 = (lottery % 100) % 10;

    //Creating the scanner
    Scanner input = new Scanner(System.in);

    //Getting the user's lottery number digits
    System.out.println("Please enter the first of your three digits (0-9):");
    int first = input.nextInt();
    System.out.println("Please enter the second of your three digits (0-9):");
    int second = input.nextInt();
    System.out.println("Please enter your third and final digit (0-9):");
    int third = input.nextInt();

    //Constructing the user's lottery number from the inputs
    int guess = (first*100) + (second*10) + third;

    System.out.println("Your guess is " + guess + ".");
    System.out.println("The lottery number is " + lottery + ".");

    //Checking the guess against the criteria for the $10,000 prize
    if(guess == lottery){
      switch(lottery - guess){
        case 0 : System.out.println("Your prize is $10,000."); break;
      }
    } else if(((lottery1 == first)
       ||(lottery1 == second)
       ||(lottery1 == third))
       &&((lottery2 == first)
       ||(lottery2 == second)
       ||(lottery2 == third))
       &&((lottery3 == first)
       ||(lottery3 == second)
       ||(lottery3 == third)))
         System.out.println("Your prize is $3,000.");
      else if(((lottery1 == first)
        ||(lottery1 == second)
        ||(lottery1 == third))
        ||((lottery2 == first)
        ||(lottery2 == second)
        ||(lottery2 == third))
        ||((lottery3 == first)
        ||(lottery3 == second)
        ||(lottery3 == third)))
          System.out.println("Your prize is $1,000.");    
  } 
}



 
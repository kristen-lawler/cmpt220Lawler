/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file has the user input a month as a number, and also a year. It then
   * outputs the name of the month and its number of days.
   */
import java.util.Scanner;

public class Lab3_11 {
  public static void main(String[] args){
  	//Creating the scanner for user inputs
    Scanner input = new Scanner(System.in);

    //Prompting the user to input the month
    System.out.println("Please enter a month as a number (1-12):");
    int month = input.nextInt();

    //Prompting the user to input the year
    System.out.println("Please enter a year:");
    int year = input.nextInt();

    
    //Determinining and outputing the appropriate month and number of days
    if(year % 4 == 0) {
      switch(month) {
        case 1: System.out.println("January 31"); 
          break;
        case 2: System.out.println("February 29"); 
          break;
        case 3: System.out.println("March 31"); 
          break;
        case 4: System.out.println("April 30"); 
          break;
        case 5: System.out.println("May 31"); 
          break;
        case 6: System.out.println("June 30"); 
          break;
        case 7: System.out.println("July 31"); 
          break;
        case 8: System.out.println("August 31"); 
          break;
        case 9: System.out.println("September 30"); 
          break;
        case 10: System.out.println("October 31"); 
          break;
        case 11: System.out.println("November 30"); 
          break;
        case 12: System.out.println("December 31"); 
          break; 
      }
    } else {
       switch(month) {
         case 1: System.out.println("January 31"); 
           break;
         case 2: System.out.println("February 28"); 
           break;
         case 3: System.out.println("March 31"); 
           break;
         case 4: System.out.println("April 30"); 
           break;
         case 5: System.out.println("May 31"); 
           break;
         case 6: System.out.println("June 30"); 
           break;
         case 7: System.out.println("July 31"); 
           break;
         case 8: System.out.println("August 31"); 
           break;
         case 9: System.out.println("September 30"); 
           break;
         case 10: System.out.println("October 31"); 
           break;
         case 11: System.out.println("November 30"); 
           break;
         case 12: System.out.println("December 31"); 
           break; 
        }
      } 
                
  }
}
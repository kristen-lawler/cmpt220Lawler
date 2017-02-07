/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file asks the user to input a letter and then outputs the 
   * appropriate number based upon the standard international letter/number
   * mapping of telephones.
   */
import java.util.Scanner;

public class Lab4_15{
  public static void main(String[] args){
    //Create the scanner
    Scanner input = new Scanner(System.in);

    //Prompt the user to input a letter
    System.out.println("Please input a letter:");
    String s = input.nextLine();
    
    //Converting letter into a lower case character
    char ch = s.toLowerCase().charAt(0);
    
    //Determining the associated number for the inputed letter
    switch(ch){
      case 'a': System.out.println(" The corresponding number is 2");
        break;
      case 'b': System.out.println(" The corresponding number is 2");
        break;
      case 'c': System.out.println(" The corresponding number is 2");
        break;
      case 'd': System.out.println(" The corresponding number is 3");
        break;
      case 'e': System.out.println(" The corresponding number is 3");
        break;
      case 'f': System.out.println(" The corresponding number is 3");
        break;
      case 'g': System.out.println(" The corresponding number is 4");
        break;
      case 'h': System.out.println(" The corresponding number is 4");
        break;
      case 'i': System.out.println(" The corresponding number is 4");
        break;
      case 'j': System.out.println(" The corresponding number is 5");
        break;
      case 'k': System.out.println(" The corresponding number is 5");
        break;
      case 'l': System.out.println(" The corresponding number is 5");
        break;
      case 'm': System.out.println(" The corresponding number is 6");
        break;
      case 'n': System.out.println(" The corresponding number is 6");
        break;
      case 'o': System.out.println(" The corresponding number is 6");
        break;
      case 'p': System.out.println(" The corresponding number is 7");
        break;
      case 'q': System.out.println(" The corresponding number is 7");
        break;
      case 'r': System.out.println(" The corresponding number is 7");
        break;
      case 's': System.out.println(" The corresponding number is 7");
        break;
      case 't': System.out.println(" The corresponding number is 8");
        break;
      case 'u': System.out.println(" The corresponding number is 8");
        break;
      case 'v': System.out.println(" The corresponding number is 8");
        break;
      case 'w': System.out.println(" The corresponding number is 9");
        break;
      case 'x': System.out.println(" The corresponding number is 9");
        break;
      case 'y': System.out.println(" The corresponding number is 9");
        break;
      case 'z': System.out.println(" The corresponding number is 9");
        break;
    }    
  }
}
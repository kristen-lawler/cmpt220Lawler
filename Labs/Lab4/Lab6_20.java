 /* author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 4
   * due date: February 28, 2017
   * version: 1.8
   * 
   * This file contains a method that counts the number of letters 
   * in a string as well as a test case using user input.
   */
import java.util.Scanner;
public class Lab6_20{
  //Creating the method to count the number of letters
  public static int countLetters(String s){
    int i = 0;
    int countLetter = 0;

    //Using a while loop to iterate through each character of the string
    while(i < s.length()){
      char j = s.charAt(i);
      //Checking to see if the character has a letter code value in decimal
      if(((j >= 65)&&(j <= 90))||((j >= 97)&&(j <= 122))){
        countLetter++;
      }
      i++;
    }
    return countLetter;
  }

  //Testing the method
  public static void main(String[] args){
    
    //Creating a scanner for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a string");
    String x = input.nextLine();

    //Using our method to count the letters in the user's input
    int letters = countLetters(x);

    //Outputting the result
    System.out.printf("This string contains %d letters." , letters);
  }
}

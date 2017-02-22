/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This file contains a method that reverses a number that is inputed as a paramater of
   * the method. It also contains a method that checks if a user input is a 
   * palindrome by utilizing the reverse method previously mentioned.
   */
import java.util.Scanner; 
public class Lab6_3{

  //Creating the reverse method
  public static int reverse(int number){
    int newDigit;
    int newNumb = 0;

    //Creating a while loop to access and reverse the digits inputed
    while(number > 0){
      newDigit = number % 10;
      number = number / 10;
      newNumb = newNumb * 10 + newDigit;
    }
    return newNumb;
  }

  //This section can be used the test the above function if it is uncommented
  /*public static void main(String[] args){
   *int x = reverse(1234);
   *System.out.println(x);
   *}
   */

  //Creating the method to check if an input is a palindrome
  public static boolean isPalindrome(int number){
    
    //Reversing the input
    int revNum = reverse(number);

    //Using a conditional to check if the input is the same as its reverse 
    if(number == revNum){
      return true;
    } else { return false; }
  }

  public static void main(String[] args){
    
    //Setting up the scanner to get a user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please input a number to check if it is a palindrome:");
    int number = input.nextInt();
    
    boolean answer = isPalindrome(number);
    
    //Outputting the appropriate response
    if(answer){
      System.out.println("That is a palindrome!");
    } 
    else{ 
      System.out.println("That is not a palindrome."); 
    }
  }
}

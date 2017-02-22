/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 3
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This program reads an unspecified number of positive integers. It 
   * then returns the number of positive integers, negative integers, the sum, 
   * and the average of the integers.
   */
import java.util.Scanner;

public class Lab5_1{
  public static void main(String[] args){

    //Setting up scanner to get user input
    Scanner input = new Scanner(System.in);  
    System.out.println("Enter any integers seperated by spaces," + 
      " the input ends if it is 0: ");

    //initiallizing the parameters that will be used in the dowhile loop
    int i = 1;
    int pos = 0;
    int neg = 0;
    float total = 0;
    float average = 0;

  /*Constructing the dowhile loop to iterate the users input and complete
  the desired calculations */
    do{
      int number = input.nextInt();
      if(number > 0){
        pos++;
        total = (float)(total + number);
        average = (float)(total / i);
      } 
      else if(number < 0){
        neg++;
        total = (float)(total + number);
        average = (float)(total / i);
      } 
      else if(number == 0){
        break;
      } 
      if(number == 0){
        break;
      }

      i++;
    } while(true);

    //Outputting the results to the user
    System.out.println("The number of positives is " + pos );
    System.out.println("The number of negatives is " + neg );
    System.out.println("The total is " + total );
    System.out.println("The average is " + average ); 
  }
}
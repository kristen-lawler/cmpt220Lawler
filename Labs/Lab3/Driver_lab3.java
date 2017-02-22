/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 21, 2017
   * version: 1.8
   * 
   * This file asks the user to give 5 inputs referring to 2 coordinate pairs 
   * and a p value. It then outputs the p-norm.
   */

import java.util.Scanner;
    
public class Driver_lab3{
  public static void main(String[] args) {
            
    //Setting up the scanner for user inputs
    Scanner input = new Scanner(System.in);

    
    for(int j = 0; j < 1000; j++){
      //Creating an array to hold the user inputs
      double[] numbers = new double[5];
          
      //Using a for loop to get and store user inputs
      for (int i = 0; i < numbers.length; i++) {
        numbers[i] = input.nextDouble();
        if((i == 0)&&(numbers[0] == 0)){
          break;
        }
        
      }

      //Checking to break outer loop if 0 is the first input
      if(numbers[0] == 0)
          break;  

      //Using the function defined below to get the p-norm as desired
      double answer = distance(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]);
      System.out.println( answer );
    }
  }
  
  //Creating the p-norm method  
  public static double distance(double x1, double y1, double x2, double y2, double p) {
    double dx = Math.abs(x1 - x2);
    double dy = Math.abs(y1 - y2);
    double pFraction = 1/p;
    double pNorm = Math.pow(Math.pow(dx, p) + Math.pow(dy, p), pFraction);
    return pNorm;
  }
}

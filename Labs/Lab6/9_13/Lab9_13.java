/* *
   * file: Lab9_13.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 6
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This program uses the Location object to find the largest element of a 
   * matrix inputed by the user.
   */
import java.util.Scanner;

public class Lab9_13{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //get user input for the matrix's dimensions
    System.out.println("Please enter the dimensions of your matrix" +
      " (rows then columns):");
    int rows = input.nextInt();
    int columns = input.nextInt();
    double[][] matrix = new double[rows][columns];

    //get user input for the elements of the matrix
    System.out.println("Please enter the numbers of your matrix row wise:");
    //iterate through rows
    for(int i = 0; i < rows; i++){
      //iterate through the columns
      for(int j = 0; j < columns; j++){
        matrix[i][j] = input.nextDouble();
      }
    }
    //use and instance of the Location object and find the largest element
    Location solution = new Location();
    solution = solution.locateLargest(matrix);
    System.out.println("The maximum value is " + solution.maxValue + 
      " at the location (" + solution.row + " , " + solution.column + ").");
  }
}
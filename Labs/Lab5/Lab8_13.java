/* *
   * file: Lab8_13.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This program locates the largest number in a two-dimensional array.
   */
import java.util.Scanner;
public class Lab8_13{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //getting dimensions for array and setting it up
    System.out.printf("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] matrix = new double[row][column];


    //getting the elements for the array
    System.out.println("Enter the array below: ");
    for(int i = 0; i < row; i++){
      for(int m = 0; m < column; m++){
        matrix[i][m] = input.nextDouble();
      }
    }

    //using method to output the largest element
    int[] location = locateLargest(matrix);
    System.out.printf("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
  }
  
  //method
  public static int[] locateLargest(double[][] a){
    int[] location = { 0 , 0 };
    double largest = a[0][0];
    //row
    for(int j = 0; j < a.length; j++){ 
      //column
      for(int k = 0; k < a[j].length; k++){ 
        if(a[j][k] > largest){
          location[0] = j; 
          location[1] = k; 
          largest = a[j][k];
        }
      }
    }
    return location;
  }
}
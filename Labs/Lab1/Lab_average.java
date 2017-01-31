/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 1
   * due date: January 31, 2017
   * version: 1.8
   * 
   * This file determines the average of a student based on
   * grade inputs for exams, labs and homeworks, and proejects
   */
import java.util.Scanner;

public class Lab_average{
  public static void main(String[] args){
    //Creating a scanner
    Scanner input = new Scanner(System.in);

    //Receiving all grade information
    System.out.println("Please enter the following as a percentage. . .");
    System.out.println("Midterm Exam:");
    double midtermE = input.nextDouble();
    System.out.println("Final Exam:");
    double finalE = input.nextDouble();
    System.out.println("Projects:");
    double projects = input.nextDouble();
    System.out.println("Homeworks and Labs:");
    double homeworkAndLab = input.nextDouble();

    //Calculating the student's average
    double average = 0.4 * homeworkAndLab + 0.2 * projects + 0.2  * 
        midtermE + 0.2 * finalE;

    //Outputting the calculated average
    System.out.println("Your final grade is " + average + ".");
  }
}
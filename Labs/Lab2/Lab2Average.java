/* *
   * file: Lab2Average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This file determines the average of a student based on
   * grade inputs for exams, labs and homeworks, and projects.
   * It then outputs the corresponding letter grade.
   */
import java.util.Scanner;

public class Lab2Average{
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

    //Outputting the associated letter grade for the calculated average
    if(average >= 95)    
      System.out.println("Your final grade is an A.");
    else if(average >= 90)
      System.out.println("Your final grade is an A-.");
    else if(average >= 87)
      System.out.println("Your final grade is a B+.");
    else if(average >= 83)
      System.out.println("Your final grade is a B.");
    else if(average >= 80)
      System.out.println("Your final grade is a B-.");
    else if (average >= 77)
      System.out.println("Your final grade is a C+.");
    else if(average >= 73)
      System.out.println("Your final grade is a C.");
    else if(average >= 70)
      System.out.println("Your final grade is a C-.");
    else if(average >= 65)
      System.out.println("Your final grade is a D+.");
    else if(average >= 60)
      System.out.println("Your final grade is a D.");
    else 
      System.out.println("Your final grade is an F.");

  }
}
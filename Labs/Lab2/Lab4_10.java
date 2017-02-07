/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * In this file, the Listing 4.3 was changed to receive an input of Y for
   * yes and N for no instead of a 1 and 0, respectively.
   */
import java.util.Scanner;

public class Lab4_10{
  public static void main(String[] args){
    String set1 = 
    " 1  3  5  7\n" +
    " 9 11 13 15\n" +
    "17 19 21 23\n" +
    "25 27 29 31";
    
    String set2 = 
    " 2  3  6  7\n" +
    "10 11 14 15\n" +
    "18 19 22 23\n" +
    "26 27 30 31";

    String set3 = 
    " 3  5  6  7\n" +
    "12 13 14 15\n" +
    "20 21 22 23\n" +
    "28 29 30 31";

    String set4 = 
    " 8  9 10 11\n" +
    "12 13 14 15\n" +
    "24 25 26 27\n" +
    "28 29 30 31";

    String set5 = 
    "16 17 18 19\n" +
    "20 21 22 23\n" +
    "24 25 26 27\n" +
    "28 29 30 31"; 

    int day = 0;

    //Create Scanner
    Scanner input = new Scanner(System.in);

    //Prompt to user to answer questions
    System.out.print("Is your birthday in Set1?\n");
    System.out.print(set1);
    System.out.print("\nEnter N for No and Y for Yes:");
    String answer = input.nextLine();
    char answerA = answer.charAt(0);

    if(answerA == 'Y')
      day += 1;

    //Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set2?\n");
    System.out.print(set2);
    System.out.print("\nEnter N for No and Y for Yes:");
    String answer1 = input.nextLine();
    char answer1A = answer1.charAt(0);

    if(answer1A == 'Y')
      day += 2;

    //Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set3?\n");
    System.out.print(set3);
    System.out.print("\nEnter N for No and Y for Yes:");
    String answer2 = input.nextLine();
    char answer2A = answer2.charAt(0);

    if(answer2A == 'Y')
      day += 4;

    //Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set4?\n");
    System.out.print(set4);
    System.out.print("\nEnter N for No and Y for Yes:");
    String answer3 = input.nextLine();
    char answer3A = answer3.charAt(0);

    if(answer3A == 'Y')
      day += 8;

    //Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set5?\n");
    System.out.print(set5);
    System.out.print("\nEnter N for No and Y for Yes:");
    String answer4 = input.nextLine();
    char answer4A = answer4.charAt(0);

    if(answer4A == 'Y')
      day += 16;

    System.out.println("\nYour birthday is " + day + "!");

  }
}    





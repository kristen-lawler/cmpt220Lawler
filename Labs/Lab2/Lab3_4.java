/* *
   * file: Lab_average.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 2
   * due date: February 7, 2017
   * version: 1.8
   * 
   * This code generates a random integer between 1 and 12. It
   * then outputs the month that corresponds to that random interger.
   */
public class Lab3_4 {
  public static void main(String[] args){
  
    //Generating random integer between 1 and 12
    int month = (int)((Math.random() * 12) + 1);

    //outputting the corresponding month name to the generated number
    if(month == 1)
      System.out.println("January");
    else if(month == 2)
      System.out.println("February");
    else if(month == 3)
      System.out.println("March");
    else if(month == 4)
      System.out.println("April");
    else if(month == 5)
      System.out.println("May"); 
    else if(month == 6)
      System.out.println("June");
    else if(month == 7)
      System.out.println("July");
    else if(month == 8)
      System.out.println("August");
    else if(month == 9)
      System.out.println("September");
    else if(month == 10)
      System.out.println("October");
    else if(month == 11)
      System.out.println("November");
    else
      System.out.println("December");
  }
}
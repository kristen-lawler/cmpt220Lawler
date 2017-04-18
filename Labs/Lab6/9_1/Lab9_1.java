/* *
   * file: Lab9_1.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 6
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This program uses the Rectangle object to create two different
   * rectangles and output their area, perimeter, height and width.
   */
public class Lab9_1{
  public static void main(String[] args){

  //create two different instances of the Rectangle object
  Rectangle rectangle1 = new Rectangle(4, 40);
  Rectangle rectangle2 = new Rectangle(3.5, 35.9);
  
  //outputting all of the appropriate information about each rectangle
  System.out.println("The first rectangle has a width of " + rectangle1.width +
    ", a height of " + rectangle1.height + ", an area of " + 
    rectangle1.getArea() + ", and a perimeter of " + 
    rectangle1.getPerimeter() +".");

  System.out.println("The second rectangle has a width of " + rectangle2.width +
    ", a height of " + rectangle2.height + ", an area of " + 
    rectangle2.getArea() +  ", and a perimeter of " + 
    rectangle2.getPerimeter() +".");
  }
}

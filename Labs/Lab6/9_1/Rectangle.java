/* *
   * file: Rectangle.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 6
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This contain the Rectangle object which had a height, width,
   * area and perimeter.   
   */
class Rectangle{
  //attributes
  public double width = 1.0;
  public double height = 1.0;
  
  //constructors
  Rectangle(double w, double h){
  width = w;
  height = h;
  }

  Rectangle(){
  }
  
  //method to get the area of the rectangle
  public double getArea(){
    return width * height;
  }
  //method to get the perimeter of the rectangle
  public double getPerimeter(){
    return ((2 * width) + (2 * height));
  }
}
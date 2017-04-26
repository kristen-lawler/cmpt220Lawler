/* *
   * file: BMI.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 25, 2017
   * version: 1.8
   * 
   * This file adds a constructor to the BMI class given in the textbook.
   */
public class BMI {
  //All attributes for the BMI object
  private String name;
  private int age;
  private double weight; // in pounds
  private double height; // in inches
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;
 
  //All constructors
  public BMI(String name, int age, double weight, double height) {
  this.name = name;
  this.age = age;
  this.weight = weight;
  this.height = height;
  }

  /** Construct a BMI with the specified name, age, weight,
  * feet, and inches
  */
  public BMI(String name, int age, double weight, double feet, double inches){
 this.name = name;
 this.age = age;
 this.weight = weight;
 this.feet = height / 12;
 this.inches = height;
  }
 
  public BMI(String name, double weight, double height) {
  this(name, 20, weight, height);
  }

  //All methods for the BMI object
  public double getBMI() {
  double bmi = weight * KILOGRAMS_PER_POUND /
  ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
  return Math.round(bmi * 100) / 100.0;
  }

  public String getStatus() {
  double bmi = getBMI();
  if (bmi < 18.5)
  return "Underweight";
  else if (bmi < 25)
  return "Normal";
  else if (bmi < 30)
  return "Overweight";
  else
  return "Obese";
  }

  public String getName() {
  return name;
  }

  public int getAge() {
  return age;
  }

  public double getWeight() {
  return weight;
  }

  public double getHeight() {
  return height;
  }
}
/* *
   * file: 
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Project 1
   * due date: March 28, 2017
   * version: 1.8
   * 
   * This program contains a method that finds the convolution of two
   * arrays, and allows the user to input the arrays of their choice.
   */
import java.util.Scanner;
public class Driver_prj1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Getting user inputs for size and elements
    System.out.println("Please input the number of elements in vector 1:");
    int sizeV1 = input.nextInt();
    double[] Vec1 = new double[sizeV1]; 
    
    System.out.println("Please input the number of elements in vector 2:");
    int sizeV2 = input.nextInt();
    double[] Vec2 = new double[sizeV2];

    System.out.println("Please input the elements of vector 1:");
    for(int i = 0 ; 0 < sizeV1 ; i++){
      Vec1[i] = input.nextDouble(); 
      if(i == (sizeV1 - 1)){
        break;
      }
    }
 
    System.out.println("Please input the elements of vector 2:");
    for(int j = 0 ; 0 < sizeV2  ; j++){
      Vec2[j] = input.nextDouble(); 
      if(j == (sizeV2 - 1)){
        break;
      }
    }
    
    //Finding the convolution and printing it
    double[] convolute = new double[(sizeV1 + sizeV2 - 1)];
    convolute = convolveVectors(Vec1 , Vec2);
    for(int k = 0; k < convolute.length; k++){
      System.out.print(" " + Math.round(convolute[k]) + " ");
    }   
  }

  //convolution method
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {
    //useful paramaters for our method
    int finalLength = (vFirst.length + vSecond.length) - 1;
    int firstLength = vFirst.length;
    int secondLength = vSecond.length;
    double index=0.0;
    
    //place holder for the convolution
    double[] vResult = new double[finalLength];

    //extending vSecond to have place holders at beginning and end
    double[] newSecond = new double[(secondLength + (firstLength -1) * 2)];
    //We want: newSecond = newSecond + vSecond but with proper placement
    for(int n = firstLength - 1; n < finalLength; n++){
      newSecond[n] = vSecond[n - (firstLength - 1)];
    }

    //flipping the array
    for(int i = 0; i < newSecond.length / 2; i++){
        double temp = 0;
        temp = newSecond[i];
        newSecond[i] = newSecond[newSecond.length - 1 - i];
        newSecond[newSecond.length - 1 - i] = temp;
      }


    //feeding each calculated element into our final array 
    for(int z = 0 ; z < finalLength ; z++){
      //setting up each summed element
      for(int i = 0 ; i < firstLength ; i++){ 
        index += vFirst[i] * newSecond[finalLength - 1 + i - z];
      }
      vResult[z] = index;
      index = 0.0;
    }
    return vResult;
  }
}

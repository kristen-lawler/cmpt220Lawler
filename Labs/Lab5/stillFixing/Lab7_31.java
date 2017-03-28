//
import java.util.Scanner;
public class Lab7_31{
  //my second attempt which isn't quite right causing me to get stuck in an infinite loop
  public static int[] merge(int[] list1, int[] list2) {
    //Setting up a place holder for the final answer
    int[] merged = new int[list1.length + list2.length];

    //paramaters
    int count = 0 ;
    boolean isSmaller = false;
    int i = 0;
    int firstStart = 0;

    //outer loop to fill our solution array with the sorted data
    while( count < list2.length + list1.length ){
      

      for(int j = firstStart; j < list1.length; j++){
        //array 1 smaller than array 2
        if( list1[j] < list2[i] ){
          merged[count] = list1[j];
          count++;
          firstStart++;
          isSmaller = false;
          if(j == (list1.length - 1)){
            merged[count] = list2[i];
            i++;
          }
          
        }
        //array 1 bigger than array 2 needs more
        else if( list1[j] > list2[i] ){ 
          merged[count] = list2[i];
          isSmaller = true;
          count++;
          i++;
        }
        //both arrays are equal
        else if( list1[j] == list2[i] ){
          firstStart++;
          merged[count] = list1[j];
          count++;
          merged[count] = list2[i]; 
          count++;
          isSmaller = true;
          i++;
        }
      }
      if(isSmaller)
        i++;
    }
    return merged;
  }







  //Testing method
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number of elements in list 1:");
    int sizeL1 = input.nextInt();

    System.out.print("Please enter the number of elements in list 2:");
    int sizeL2 = input.nextInt();

    int[] l1 = new int[sizeL1];
    int[] l2 = new int[sizeL2];

    System.out.print("Please enter the sorted elements of list 1:");
    for(int i = 0; i < sizeL1; i++){
      l1[i] = input.nextInt();
      if(i == (sizeL1 - 1))
        break;
    }

    System.out.print("Please enter the sorted elements of list 2:");
    for(int i = 0; i < sizeL2; i++){
      l2[i] = input.nextInt();
      if(i == (sizeL2 - 1))
        break;
    }

    int[] answer = merge(l1 , l2);
    for(int i = 0; i < answer.length; i++){
      System.out.print(answer[i] + " ");
    }
  }

/*
WORKED BUT NOT CORRECT NUMBER OF COMPARISONS
    //making an array that contains both sorted arrays
    for(int i = 0; i < (list1.length + list2.length); i++){
      if(i < list1.length){
        merged[i] = list1[i];
      }
      else{
        merged[i] = list2[i-list1.length];
      }
    }
    
    //sorting our merged array
    for(int i = 0; i < merged.length - 1; i++){
      //find min
      int currentMin = merged[i];
      int currentMinIndex = i;

      for(int j = i + 1; j < merged.length; j++){
        if(currentMin > merged[j]){
          currentMin = merged[j];
          currentMinIndex = j;
        }
      }
      //swap list[i] with list[currentMinIndex] if need be
      if(currentMinIndex !=i){
        merged[currentMinIndex] = merged[i];
        merged[i] = currentMin;
      }
    }
    return merged;
  }

  
  //Test
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the length of your first list:");
    int l1 = input.nextInt();

    System.out.println("Please enter the length of your second list:");
    int l2 = input.nextInt();
    
 
    int[] list1 = new int[l1];
    System.out.println("Please enter " + l1 + " numbers:");
    for(int x = 0; x < l1 ; x++){
    	list1[x] = input.nextInt();   
    }

    int[] list2 = new int[l1];
    System.out.println("Please enter " + l2 + " numbers:");
    for(int y = 0; y < l2 ; y++){
    	list2[y] = input.nextInt();   
    }

    int[] mergedArray = merge(list1 , list2);
    for(int k = 0; k < mergedArray.length; k++){
    	System.out.print(" " + mergedArray[k] + " ");
    }
  }*/
}





/* *
   * file: Location.java
   * author: Kristen Lawler
   * course: CMPT 220
   * assignment: Lab 5
   * due date: April 18, 2017
   * version: 1.8
   * 
   * This is an object which contains a method that locates the largest number
   *  in a matrix.
   */
class Location{
  //attributes
  public int row;
  public int column;
  public double maxValue; 

  //constructor
  Location(){
  } 

  //method to locate the largest element in the matrix
  public Location locateLargest(double[][] a){
    maxValue = a[0][0];
    row = 0;
    int rowDim = a.length;
    column = 0;
    int columnDim = a[0].length;
    //iterate through the rows
    for(int i = 0; i < rowDim; i++){
      //iterate through the columns
      for(int j = 0; j < columnDim; j++){
        //check all elements to find the largest
        if((j != (columnDim - 1))&&(maxValue <= a[i][j+1])){
          maxValue = a[i][j+1];
          row = i + 1;
          column = j + 2;
        }
      }
    }
    //output a location object with the appropriate information
    Location result = new Location();
    result.maxValue = maxValue;
    result.row = row;
    result.column = column;

    return result;
  }
}
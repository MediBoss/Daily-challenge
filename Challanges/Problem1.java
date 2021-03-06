/**
Coded By Medi W. Assumani
Language : Java

        DOCUMEMTATION
        *************
    This program finds the sum of all the multiples of

    of 3 and 5 below 1000

**/

public class MultiplesOfFiveAndThree{
  public static void main(String[] args){
          
    System.out.println("\n\nThe sum of all Multiples of Five and Three is : "+ multiples(1000)+"\n\n");
  }
/*
    *@param limit is the range or the highest number
    */
    //function to get the sum of multiples of 3 and 5
    //postcondition : the sum is returned
    public static int multiples(int limit){
           
    int sum = 0;
    for(int k = 1; k < limit; k++){
        if(k % 3 == 0 || k % 5 == 0){
          sum+= k;
        }
      }
      return sum;
    }
}


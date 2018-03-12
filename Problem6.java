/*
  Coded By : Medi W. Assumani
  Language : JAVA
  Problem: Determine if a number is a power of two.

            Constraints
            ***********

1. Is the input number an int?
Yes
2. Can we assume the inputs are valid?
No
3. Is the output a boolean?
Yes
4. Can we assume this fits memory?
Yes

Test Cases
None -> TypeError
0 -> False
1 -> True
2 -> True
15 -> False
16 -> True
*/
import java.io.IOException;
import java.lang.Math;

public class PowerOfTwo{
  public static void main(String[] args){

  }

  /*
    Function to check if a number is a power of two
    @param : number : the number to be tested of type int
  */
  public static boolean isPowerOfTwo(int number){

    if (number %2 != 0 || number < 0){
      return False
    }else{
      for(int i = 1; i < number; i++){
        if(Math.pow(i,2) == number){
          return true
        }
      }
    }
    return fasle
  }
}


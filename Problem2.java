/*
      FIND THE BUG AND COMPLETE TO GET CORRECT RESULT
              ***Challenge 2***
              /**
 * Coded By : Medi W. Assumani
 * Language : Java
 * Program Name : Even Fibonacci numbers
 * 
 *          DOCUMENTATION
 *          *************
 * This program finds the sum of the even-valued terms. Each new term in the Fibonacci sequence 
 
 is generated by adding the previous two terms.

By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued term

 * **/
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class Problem2{

    static final int LIMIT = 4000000; // stores the limit condition
    public static void main(String[] args){

        System.out.println(fibSequence());

    }
//function to find the sum of even fibonacci numbers given the max/limit number
 //Postcondition : The sum of the first 40 million even integers
      
public static BigInteger fibSequence(){

        ArrayList<BigInteger> fibValues = new ArrayList<BigInteger>();
        BigInteger decoy = BigInteger.valueOf(2);
        BigInteger decoy_2 = BigInteger.valueOf(0);
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger fibSum = BigInteger.valueOf(0);
        BigInteger finalSum = BigInteger.valueOf(0);
        int count = 0;
      
      while(count < LIMIT){

            fibSum = a.add(b);
            a = b;
            b = fibSum;
              if(fibSum.remainder(decoy) == decoy_2){

                fibValues.add(fibSum);

                  for(int index = 0; index < fibValues.size();index++){

                      finalSum = finalSum.add(fibValues.get(index));

                  }
              }
            count++;
        }

        return finalSum;

    }

}


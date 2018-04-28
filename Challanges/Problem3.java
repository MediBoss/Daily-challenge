/**
 * Coded By : Medi W. Assumani
 * Language : Java
 * 
 *          DOCUMENTATION
 *          *************
 * This program finds the largest prime factor of a given number passed as an
 * 
 * Argument.
 * 
 *              STEPS
 *              *****
 * 1. I created a function called getFactors that gets all the factors of
 *  a number passed as a parameter. Then those factors are returned in a list.
 * 
 * 2.Then function getFactors is called for each numbers in the list.
 * 
 * 3. Next, if the number in the ith position of the list (array) has a size of two
 *      
 *  or below, then it's a prime number;
 * 
 * 4. Lastly, function maxNumber is called to get the highest number.
 * 
 * **/

import java.util.*;
import java.util.Scanner;
public class LargestPrimeFactor{

  public static void main(String [] args){
    /**
     * Gets all the factors of the number passed as an argument to the 
     * function getFactors;
     * */

	//getting the numbercto find the highest factor from the usre
	Scanner in1 = new Scanner(System.in);
	System.out.println("\n\tEnter The Number : \n\n");
	int userInput = in1.nextInt();


    List<Integer> primeFactors = getFactors(userInput);
        
    /**
     * Stores only prime numbeers among the list of factors of the Parameter
     * */
    
    List<Integer> primeNumbers = new ArrayList<Integer>();
    
    /**
     *  itterates through primeFactores, check for prime numbers, then adds
     *  it to the primeNUmbers List.
     * */
    
    for(int i = 0 ; i < primeFactors.size(); i++){
        
        //stores the factors of the ith element
        List<Integer> currFactors = getFactors(primeFactors.get(i));

                   //checks for the prime number
                if(currFactors.size() <= 2){
                    //adds the prime number to the list
                   primeNumbers.add(primeFactors.get(i)); 
            }        
    }
      
    //itterates through the list of prime numbers and gets the largest
    
    System.out.println("The Highest prime Factor of "+userInput+" is "+ maxNumber(primeNumbers)+"\n");
    
  }
       // This function finds the highest Element on a list
  public static int maxNumber(List<Integer> list){
          
        int max = 0;          
          
          for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                
                max = list.get(i);             
            }
       }   
        
        return max;
          
      }

  public static List<Integer> getFactors(int number){
        //get all the factors of @param number
        List<Integer> factors = new ArrayList<Integer>();
        for(int k = 1; k <= number; k++){
            //checks if the current number is a factor
            if(number % k == 0){
                //adds it in the list if it is a factor
                factors.add(k);   
                
            }
        }  
        
     return factors;   
  }      
}

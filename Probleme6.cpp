/**

  Coded By : Medi Assumani


  Language : C++


  Problem Description :  Find the difference between the sum of the squares of the 

  first one hundred natural numbers and the square of the sum.


**/

#include <iosream>
#include <cmath>

using namespace std;

double sumSquareDifference();
int main(){
  
  
  
  
  
}

double sumSquareDifference(){
  
  //Get the sum of the squares  of the first hundred natural numbers

    double sumOne,sumTwo,difference;
  
    for(int i = 0; i <= 100; i++){

        sumOne += Math.pow(i,2.0);
        sumTwo += i;
     }
  
  difference = (Math.pow(sumTwo,2.0) - sumOne);
  
  
  return difference;
}

//
import java.util.Scanner;
import java.util.Math;
import java.util.*;

public class Solution{
public boolean int  isperfectsquare(int num){

if(num  ==  0 ) return false ;

long left =  1 ;
long right = num ;

while( left < = right ) {
long mid = left + right / 2 ;

long mul = mid * mid ;

if(mul == num){
  return true;
}
else if(mul > num)

{
  left = mid  + 1 ;
} else 
  {
    right = mid - 1;
  }
  return false ;


}
}
  
  




















public static void main(String[] args){

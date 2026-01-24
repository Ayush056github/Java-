// 
import java.util.Scanner;
import java.util.*;

public class Solution{
  public boolean isString( String s){
        int i = 0 ; int j = s.length() - 1 ;
        while(i<=j){
          if(s.charAt(i)!=s.charAt(j))  return false; 
          {
            i++;
            j--;
          }
          
          
        }
    return true;
    
  }
}
    

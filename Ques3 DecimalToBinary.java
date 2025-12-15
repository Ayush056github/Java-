// 

import java.util.*;

public class DecimalToBinary{
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);

  if( sc.hasNextInt()) {
    int decimalNunnber < 0 || decimalNumber > 10000){
      return;
    }
    String result = convertToBinary(decimalNumber);
    System.out.println(result);
  }
    sc.close();
  }
  '
public static String convertToBinary(int n){
  if(n == 0){
    return "0";
  }
  StringBuilder binary = new StringBuilder();

  int temp= n;

  while (temp > 0 ){
    int remainder = temp % 2;
    binary.insert(0,remainder);
    temp = temp / 2;
  }
  return binary.toString();
}
}
// 

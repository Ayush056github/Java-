// 
import java.util.Scanner;
import java.text;

public class Currency{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double payment = sc.nextDouble();

  NumberFormat US = NumberFormat.getCurrencyInstance(Local.US);
  NumberFormat India = NumberFormat.getCurrencyInstance(new Local("en","IN");
  NumberFormat China = NumberFormat.getCurrencyInstance(Local.CHINA);
  NumberFormat France = NumberFormat.getCurrencyInstance(Local.FRANCE);

    
        System.out.println("US:" + us.format(payment));
    
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
  }
}
  

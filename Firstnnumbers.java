import  java .util.*;

public class Firstnnumbers {
    public static void main(String[] args) {
        
    
    Scanner sc  =  new Scanner (System.in);
    int n = sc.nextInt();
    int  sum = 0 ;
    for(int i = 0;i<=n;i++) {
        sum= sum+i;
    }
    System.out.println("The sum of first n numbers is :"+ sum);
    sc.close();

}
}

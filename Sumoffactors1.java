// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(sumoffactors(n));
    }
    static int sumoffactors(int n ){
        int sum = 0;
        for(int i =2;i<=n;i++){
            while(n%i==0){
                sum+=i;
                n/=i;
            }
        }
       return sum;
    }
}

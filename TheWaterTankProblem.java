// 
import java.util.*;
import java.util.Scanner;

public class Mainnn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int filled = t * 10;
        int leak = t / 5;
        int lost = leak*15;
        
        int remanig = filled - lost ;
        System.out.println("water ="+remanig+"litre");
    }
}

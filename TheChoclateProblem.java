// 
import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int boxes = n/10;
        int remaing = n%10;
        
        System.out.println(boxes+" ");
        System.out.println(remaing+" ");
    }
}

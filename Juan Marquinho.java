// 
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[1000];
        int s,i,j,t,c=0,l1,l2;
        
        System.out.println("Enter the no.sample:");
        s=sc.nextInt();
        
        System.out.println("Enter the no. ranges");
        t = sc.nextInt();
        
        for(i =0;i<s;i++){
            a[i]=sc.nextInt();
        }

        for(i=0;i<t;i++){
            System.out.print("Enter the max and min ");
            l1 = sc.nextInt();
            l2 = sc.nextInt();

            for(j = 0 ; j<s ; j++){
                if((a[j]>=l1) && (a[j]<=l2))
                    c++;
            }

            System.out.println(c);
            c=0;
        }
    }
}

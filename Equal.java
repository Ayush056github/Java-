import java.util.*;

public class Equal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        if(num1==num2){
            System.out.println("Both numbers are equal:");
        }else if(num1>num2){
             System.out.println( "num1 is greater than the num2");
        }else{
            System.out.println("num1 is lessar than num2 ");
        }
    }
}

    


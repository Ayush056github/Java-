import java.util.*;
class MinimumUnit{
    public static int CalculateMinimumUnit(int P ,  int X , int Y){
        int bigmachine = P/100;
        int remmachine = P%100;
        int powerM = bigmachine*X;
        int powerconsumption =X;
        int totalconsumption = bigmachine*powerconsumption;
        int powerNRemaining = (int) Math.ceil(remmachine / 4.0) * Y;

        int usebigmachine=powerM+totalconsumption;
        int useremmachine=powerM+powerNRemaining;

           return Math.min(usebigmachine, useremmachine);
       
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(CalculateMinimumUnit(P, X, Y));
    }
 }
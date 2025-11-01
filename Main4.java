
import java.util.Scanner;


class Main4{
    public   static int optiminzedSolution(int N , int X ){
        int totaltime = (N-1)*10;
        int  Arrivaltime = (N-1)*X;

        return Math.max(totaltime - Arrivaltime,0);
        


    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        System.out.println(optiminzedSolution(N, X));
}
}
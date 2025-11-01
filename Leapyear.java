import java.util.Scanner;


public class Leapyear {
 static int Leap(int year){
    if((year % 400 == 0 ) || (year%100 != 0) && (year % 4 == 0))
    {
        return 1;
    }
    else{

        return 0;
    }
    }public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        System.out.println(Leap(year));
    } }
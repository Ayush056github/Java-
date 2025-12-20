// 
import java.util.Scanner;

public class ClockProblem{
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

      int X = sc.nextInt();
      int Y = sc.nextInt();


    int product = X*Y;
    int time =product%12;

    if(time == 0){
      time=12;
    }
    System.out.println(time);
  }
}

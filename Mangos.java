import java.util.Scanner;
public class Mangos{
    public static int Mangosdistribution(int  mangoses , int persons ){
        int ways = (mangoses+persons-1)/persons;
        return ways;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mangoses = sc.nextInt();
        int persons = sc.nextInt();

        int result = Mangosdistribution(mangoses, persons);
        System.out.println(result);
    }
}


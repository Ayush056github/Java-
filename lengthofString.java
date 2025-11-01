import java.util.Scanner;
class lengthofstring{
    public static int CalculateLength(String str){
        int cnt = 0;
        for(char ch : str.toCharArray()){
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number of String : ");
        String str = sc.next();
        System.out.println(CalculateLength(str));
    }
}
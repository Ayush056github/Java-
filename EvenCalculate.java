import java.util.Scanner ;

class EvenCalculate{
    public static int even(int arr[] ,int n){
        int ans = 0 ;
        for(int i = 0 ; i < n ; i++){
            if( arr[i] % 2 == 0){
                ans += arr[i];

            } 
        } 
            return ans;

    
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int arr[] = {1,3,4,5,6,7,8};
    int n = arr.length;


    System.out.println ("Sum of Even:"+even(arr,n ));

}
}
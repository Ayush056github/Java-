public class EvenEven{
    public static void main(String[] args) {
        int n = 6;
        int [] arr = { 1,2,3,4,5,6};
        String ans=" ";

        for(int i = 0 ; i < n ; i++){
            if(arr[i]%2==0){
                System.err.print("even");
            }else{
                System.out.print("odd");
            }
            System.out.println(ans);
        }
    }
}
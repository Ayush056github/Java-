public class InvertedPyramid {
    public static void main(String[] args) {
        int n   = 8 ;
        for ( int i = n ; i <= n; i++)
        {
            for ( int j = 1 ; j <= n-i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for( int j = 1; j <= n ; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    

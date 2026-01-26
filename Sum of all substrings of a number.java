class Solution {
    public static int sumSubstrings(String s) {
        int count = 0 ;
        int n = s.length() ;
        for(int i = 0 ; i < n ; i++){
            for(int j=i;j < n;j++){
                String x =  s.substring(i,j+1);
                count = count + Integer.parseInt(x);
                
            }
        }
        return count;
        
    }
}

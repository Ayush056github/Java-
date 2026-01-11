// 
class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;   

        int wise = 0;
        int temp = n;

       
        while (temp != 0) {
            wise = (wise << 1) | 1;
            temp = temp >> 1;
        }

       int  ans = n ^ wise ;
       
       return ans ;
        
    }
}


// 

// import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binstr = sc.nextLine();
        
        System.out.println(lengthcontigiousbinary(binstr));
    }
    public static int lengthcontigiousbinary(String binstr){
        
        if(binstr == null || binstr.length() == 0){
            return -1;
        }
        int currcount = 0;
        int maxcount = 0;
        
        for(int i = 0;i<binstr.length();i++){
            if(binstr.charAt(i)== '1'){
                currcount++;
                maxcount=Math.max(maxcount,currcount);
            }else{
                currcount=0;
            }
        }
        return maxcount;
        
    }
    
}

// 
import java.util.*;
import java.util.Scanner;

public class Mainn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String str = sc.nextLine();
        
        if(str == null){
            System.out.println(-1);
            return ;
            
        }
        boolean[] visited = new boolean[26];
        int count = 0;
        
        for(char ch:str.toCharArray()){
            if(!visited[ch-'a']){
                visited[ch-'a']=true;
                count++;
                
                }
            }
            System.out.println(count);
        }
    }

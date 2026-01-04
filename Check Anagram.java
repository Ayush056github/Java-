//  

// Approach -  Sabse pehle humne dono strings s aur t ko lowercase me convert kiya 
// taaki capital–small ka issue na aaye. Phir agar dono ki length same nahi hai to direct false return kar diya, kyunki anagram ke liye length 
  // same hona zaroori hai. Uske baad humne size 26 ka frequency array banaya (kyunki English alphabet 26 hote hain). Ek hi loop me, s ke har character ka count increase kiya aur 
  // t ke corresponding character ka count decrease kiya. Finally, agar frequency array ka koi bhi element zero nahi hai, 
// matlab kisi character ka count match nahi hua, to false; warna sab zero hai to dono strings perfect anagram hain aur true return ho jata hai. 


class Solution {
    public boolean isAnagram(String s, String t) {
        

    s=s.toLowerCase();
    t=t.toLowerCase();

    if(s.length() != t.length())return false;

    int [] freq = new int[26];

    for(int i = 0 ; i < s.length();i++){
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;

    }

    for(int x : freq){
        if(x!=0)return false;

    }return true;
    }
}

// 


  

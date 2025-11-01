public class String4{
    public static void main(String args[]) {
        StringBuilder sb = new  StringBuilder("Ayush");

        for ( int i = 0 ; i <sb.length()/2;i++){
            int front = i ;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);
        // sb.append("y");
        // sb.append("u");
        // sb.append("sh");
        // System.out.println(sb);

        //  char At index 0 
        // System.out.println(sb.charAt(0));
        
        //  set char at index 0 
        // sb.setCharAt(0,'L');
        // System.out.println(sb);

        //  insert char at index at 0 

// sb.insert(0, "Aa");
// System.out.println(sb);

//    delete char at index  
// sb.delete(0,1);
// System.out.println(sb);
        
    }
}
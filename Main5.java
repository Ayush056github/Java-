class Main5{
    public  static  int SumOfXor(int N , int A[]){
        int even = 0 ;
        int odd = 0 ;

        for( int i=0;i<N;i++){
        if(A[i]%2 == 0){
            even += A[i];
        }else{
            odd += A[i];
        }
        }
        return  even-odd ;
    }
        public static void main(String[] args){
            
            int input1 = 6;
            int[] input2 ={10,5,6,3,7,2};


            int result = SumOfXor(input1,input2);
            System.out.println(result);
        }
    }

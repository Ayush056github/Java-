import java.util.*;
class Main3 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles; 

        while (numBottles >= numExchange) {
            int newBottle = numBottles / numExchange; 
            int remBottle = numBottles % numExchange; 

            total += newBottle; 
            numBottles = newBottle + remBottle; 
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        Main3 obj = new Main3();
        System.out.println(obj.numWaterBottles(9, 3));
    }
}


public class Solution {
    public static void main(String[] args){
        int n = 10;
        System.out.println("Toatl money after" + n + "days:" + totalMoney(n));
    }
    public static int totalMoney(int n ){
        int weeks = n / 7;
        int extraDays = n % 7;
        int total = 0;
          
        for(int i = 0; i < weeks ; i++){
            total += 28 + (i * 7);
        }
        
        int startDeposit = weeks + 1;

        for(int i = 0; i < extraDays ; i++ ){
            total += startDeposit + i;
        }
        return total;
    }
}
 

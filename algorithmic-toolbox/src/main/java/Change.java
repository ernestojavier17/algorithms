import java.util.Scanner;

/**
 * Task. The goal in this problem is to find the minimum number of coins needed to change the input value
 * (an integer) into coins with denominations 1, 5, and 10.
 */
public class Change {

    static int getChange(int m) {
         int[] coins = {10, 5, 1};
         int change = 0;
         int moneyLeft = m;
         for(int i=0; i< coins.length; i++) {
             if(coins[i] <= m) {
                 //How many times do I need to add this coin?
                 while(moneyLeft >= coins[i]) {
                     change += 1;
                     moneyLeft -= coins[i];
                 }
             }
         }
        return change;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));
    }
}


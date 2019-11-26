package main;

import java.util.HashMap;

public class CoinChange {

    public static long makeChange(int[] coins, int money) {
        HashMap<String, Long> memo = new HashMap<>();
        Long l = makeChange(coins, money, 0, memo);
        System.out.println("Memo Map: " + memo.toString());
        return l;
    }

    public static long makeChange(int[] coins, int money, int index, HashMap<String, Long> memo){
        if(money == 0){
            return 1;
        }
        if(index >= coins.length){
            return 0;
        }
        String key = money + "_" + index;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int amountWithCoins = 0;
        long ways = 0;
        while(amountWithCoins <= money){
            int remaining = money - amountWithCoins;
            ways += makeChange(coins, remaining, index+1, memo);
            amountWithCoins += coins[index];
        }

        memo.put(key, ways);
        return ways;
    }
}

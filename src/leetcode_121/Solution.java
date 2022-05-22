package leetcode_121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int maxProfit(int[] prices) {
    if(prices.length == 1){
        return 0;
    }
    int buy = prices[0];
    int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }

    return maxProfit;
    }


    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}

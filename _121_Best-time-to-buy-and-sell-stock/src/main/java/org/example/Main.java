package org.example;

import java.util.Map;

/*
https://www.youtube.com/watch?v=oLVNUJCq1co&list=PLoDervMHdCDJBy_6BEx4eUM2QvuYHFYja&index=10
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));//5
        System.out.println(maxProfit(new int[]{7,1,5,1,8,4}));//7
        System.out.println(maxProfit(new int[]{7,3,5,2,8,4,1}));//6
    }

    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice)
                minPrice = price;
            int currentProfit = price - minPrice;
            if (maxProfit < currentProfit)
                maxProfit = currentProfit;
        }

        return maxProfit;
    }
}
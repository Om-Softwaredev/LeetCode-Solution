package com.company;

public class LeetCode1281 {
//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));

    }
    static int subtractProductAndSum(int n) {
        int sum =0;
        int product =1;
        while(n>0){
            int rem = n%10;
            product *=rem;
            sum +=rem;
            n= n/10;
        }
        return product-sum;
    }
}

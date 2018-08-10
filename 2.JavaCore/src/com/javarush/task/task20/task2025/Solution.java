package com.javarush.task.task20.task2025;

/* 
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        
        for(long s = 1; s < N; s++){
            int m = 1;
            while(s / Math.pow(10, m) > 1){
                m++;
            }
            
            
            
            
            
            
            if (s==N) break;
        }
        
        
        
        return result;
    }
    
    
    public static long sum(long n, int m){
        long mult = 1;
        for(int i = 0; i < m; i++){
                mult = mult * (n % 10);
        }
        
        long sum = mult;
        if (n > 9){
            sum = sum + sum(n/10, m);
        } 
          
        return sum;
    }
    

    public static void main(String[] args) {
        long a = 8208;
        System.out.println(sum(a,4));
        
    }
}

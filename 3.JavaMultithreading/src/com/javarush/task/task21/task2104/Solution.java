package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Solution n) {

        if (n == null) return false;

        if (!(n instanceof Solution)) return false;

        if (this == n) return true;
        
        if (this.first != null){
            if (!this.first.equals(n.first)) return false;
        } else {
            if (n.first != null) return false;
        }

        if (this.last != null){
            if (!this.last.equals(n.last)) return false;
        } else {
            if (n.last != null) return false;
        }
        
        return true;
    }

    public int hashCode() {
        int result = 31 * (first != null ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0); 
        return result; 

    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}

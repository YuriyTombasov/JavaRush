package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Solution o) {

        if (o == null) return false;

        if (!(o instanceof Solution)) return false;

        if (this == o) return true;
        
        if (this.first != null){
            if (!this.first.equals(o.first)) return false;
        } else {
            if (o.first != null) return false;
        }

        if (this.last != null){
            if (!this.last.equals(o.last)) return false;
        } else {
            if (o.last != null) return false;
        }
        
        return true;
    }

    public int hashCode() {
        int result = 31 * (first != null ? first.hashCode() : 0) + (last != null ? last.hashCode() : 0); 
        return result; 

    }
    
    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}

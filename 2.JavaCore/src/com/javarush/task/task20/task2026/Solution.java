package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };
        byte[][] a3 = new byte[][]{
                {0, 1, 1, 0, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0}
        };
        byte[][] a4 = new byte[][]{
                {1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");

        System.out.println("count = " + getRectangleCount(a3) + ". Должно быть 8");
        System.out.println("count = " + getRectangleCount(a4) + ". Должно быть 1");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0; // результат, кол-во квадратов. Считается рекурсивно с шагом +1
        
        boolean isStop = false; // прямоугольник полностью найден и заменен на 0, остановить поиск
        boolean inRec = false; // маркер нахождения в прямоугольнике
        boolean isEnd = false; // маркер выполнения перехода на новую строку для поиска конца прямоугольника
        int indX1 = 0; //начало прямоугольника по оси x
        int indX2 = a.length; //конец прямоугольника по оси x
        
        
        for(int i = 0; i < a.length; i++){
            if (!isStop){
                for(int j = indX1; j < indX2; j++){
                    if (a[i][j] == 1) {
                        a[i][j] = 0;
                        isEnd = false;
                        if(!inRec){
                            inRec = true;
                            indX1 = j;
                        }
                    } else if (a[i][j] == 0 && inRec){
                        if (isEnd == false){
                            indX2 = j;
                            isEnd = true;
                            break;
                        } else {
                            isStop = true;
                            break;
                        }
                    }
                }
            } else break;
        }
        
        if (inRec){
            count = 1 + getRectangleCount(a);
        }
        
        return count;
    }


}

package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
        List<Word> wrd = detectAllWords(crossword, "home", "same");
        for(Word temp : wrd){
            System.out.println(temp);
        }
        
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
            
        /*
        Возможно 8 направлений поиска:
        Север = N
        Юг = S
        Запад = W
        Восток = E
        Северо-Запад = NW
        Северо-Восток = NE
        Юго-Запад = SW
        Юго-Восток = SE
        
        Определение возможных направлений поиска:
            - Если длина слова в искомом направлении не вмещается в границы массива - то в этом направлении не ищем.
        
        Алгоритм:
            1. Ищем в массиве слева направо первую букву слова и запоминаем ее координаты
            2. По координатам первой буквы и длине слова определяем возможнеые направления поиска
            3. Для каждого доступного направления - ищем в заданном направлении поочереди каждую букву из слова.
                Если конец слова не достигнут и найдено не совпадение - поиск прекращается.
                Если достигнут конец слова, то создаем объект слово и добавляем его в список.
        */
        
        List<Word> list = new ArrayList<>();
        
        int length = crossword.length;
        int weigth = crossword[0].length;
        for (String word : words){
            
            char[] charsWord = word.toCharArray();
            
            for (int i = 0; i < length; i++){
                for (int j = 0; j < weigth; j++){
                    if (charsWord[0] == crossword[i][j]){
                        int firstY = i;
                        int firstX = j;
                        int lastY = firstY;
                        int lastX = firstX;
                        int textLength = charsWord.length;
                        
                        // E
                        lastY = firstY;
                        lastX = firstX;
                        if (lastX + textLength - 1 < weigth)
                        {
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastX++;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX-1, lastY);
                                list.add(wrd);
                            }
                        }
                        
                        // SE
                        lastY = firstY;
                        lastX = firstX;
                        if (lastX + textLength - 1 < weigth && lastY + textLength - 1 < length){
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastX++;
                                    lastY++;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX-1, lastY-1);
                                list.add(wrd);
                            }
                        }
                        
                        // S
                        lastY = firstY;
                        lastX = firstX;
                        if (lastY + textLength - 1 < length){
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastY++;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX, lastY-1);
                                list.add(wrd);
                            }
                        }
                        
                        // SW
                        lastY = firstY;
                        lastX = firstX;
                        if (lastX - textLength +1 >= 0 && lastY + textLength - 1 < length){
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastX--;
                                    lastY++;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX+1, lastY-1);
                                list.add(wrd);
                            }
                        }
                        
                        // W
                        lastY = firstY;
                        lastX = firstX;
                        if (lastX - textLength +1 >= 0){
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastX--;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX+1, lastY);
                                list.add(wrd);
                            }
                        }
                        
                        // NW
                        lastY = firstY;
                        lastX = firstX;
                        if (lastX - textLength +1 >= 0 && lastY - textLength + 1 >= 0){
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastX--;
                                    lastY--;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX+1, lastY+1);
                                list.add(wrd);
                            }
                        }
                        
                        // N
                        lastY = firstY;
                        lastX = firstX;
                        if (lastY - textLength + 1 >= 0){
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastY--;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX, lastY+1);
                                list.add(wrd);
                            }
                        }
                        
                        // NE
                        lastY = firstY;
                        lastX = firstX;
                        if (lastX + textLength - 1 < weigth && lastY - textLength + 1 >= 0){
                            int signNum = 0;
                            while(signNum < textLength){
                                if (charsWord[signNum] == crossword[lastY][lastX]){
                                    lastX++;
                                    lastY--;
                                    signNum++;              
                                } else break;
                            }
                            
                            if (signNum == textLength){
                                Word wrd = new Word(word);
                                wrd.setStartPoint(firstX, firstY);
                                wrd.setEndPoint(lastX-1, lastY+1);
                                list.add(wrd);
                            }
                        }
                    }
                }
            }
        
        
        }
        
        
        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}

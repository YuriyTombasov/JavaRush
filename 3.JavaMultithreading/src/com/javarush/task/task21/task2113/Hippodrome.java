/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tombasov_ya
 */
public class Hippodrome {

    private List<Horse> horses;

    public static Hippodrome game;

    public List<Horse> getHorses(){
        return horses;
    }

    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }
    
    public static void main(String[] args){
        
        game = new Hippodrome(new ArrayList<Horse>());
        
        game.horses.add(new Horse("Wight", 3, 0));
        game.horses.add(new Horse("Black", 3, 0));
        game.horses.add(new Horse("Brown", 3, 0));

        game.run();

        game.printWinner();
    }

    public void run(){

        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void print(){
        for(Horse horse : horses){
            horse.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public void move(){
        for(Horse horse : horses){
            horse.move();
        }

    }

    public Horse getWinner(){
        Horse winner = horses.get(0);

        for (Horse horse : horses){
            if (winner.distance < horse.distance){
                winner = horse;
            }
        }

        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name + "!");
    }
    
}

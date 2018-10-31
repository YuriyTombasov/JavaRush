/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task29.task2909.human;

/**
 *
 * @author tombasov_ya
 */
public class Soldier extends Human{

    public Soldier(String name, int age) {
        super(name, age);
    }
    
    public void live() {
            fight();
    }
    
    public void fight() {
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task21.test;

/**
 *
 * @author tombasov_ya
 */
public class TestClass {
    
    static int count = 0;
    static String i = "Static";
    
    public static void main(String[] args){
        
        System.out.println("**********This is the start of a main method");
        System.out.println("Main: static i = " + i);

        System.out.println("constructor invoke start");
        TestClass tc = new TestClass();
        System.out.println("constructor invoke end");
        System.out.println("**********This is the end of a main method");

    }
    


    static {
        staticMethod();
        count++;
        i = i + "+StaticBlock";
        System.out.println(count + ". StaticBlock: i = " + i);

        
    }
        

    public TestClass(){
        count++;
        System.out.println(count + ". -------Constructor's body start"); 
        System.out.println("Constructor: i = " + i); 
        String ii = "Instance";
        System.out.println("Instance: ii = " + ii);
        System.out.println("-------Constructor's body end"); 
    }
    
    {
        staticMethod();
        count++;
        String i = "Bracers";
        System.out.println(count + ". Bracers: i = " + i);
        
    }
    
    
    public static void staticMethod(){
        count++;
        i = i + "+staticMethod";
        System.out.println(count + ". staticMethod: i = " + i);
    }
    

}

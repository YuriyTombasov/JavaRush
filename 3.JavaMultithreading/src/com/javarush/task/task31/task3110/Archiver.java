/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task31.task3110;

import java.io.*;
import java.nio.file.*;

/**
 *
 * @author tombasov_ya
 */

/*
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\SourceToZip.txt
C:\Users\tombasov_ya\Tom\GIT\TasksJavaRush\test\TargetToZip.zip

*/

public class Archiver {
    
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input full path of archive:");       
        ZipFileManager manager = new ZipFileManager(Paths.get(reader.readLine()));
        
        System.out.println("Input full path of file:"); 
        manager.createZip(Paths.get(reader.readLine()));
        
        reader.close();
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task31.task3110;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.*;
/**
 *
 * @author tombasov_ya
 */
public class ZipFileManager {
    
    private Path zipFile;
    
    ZipFileManager(Path zipFile){
        this.zipFile = zipFile;
    }
    
    
   
    public void createZip(Path source) throws Exception{
        
        try(ZipOutputStream out = new ZipOutputStream(Files.newOutputStream(zipFile))){
            ZipEntry outEntry = new ZipEntry(source.getFileName().toString());
            out.putNextEntry(outEntry);
            
            try(InputStream in = Files.newInputStream(source)){
                
                while(in.available() > 0){
                    out.write(in.read());
                }
                
                /*
                byte[] buffer = new byte[1024];
                int len;
                while((len = in.read(buffer)) > 0){
                    out.write(buffer, 0, len);
                }
                */
            }
            
            out.closeEntry();
        }
    }
    
}

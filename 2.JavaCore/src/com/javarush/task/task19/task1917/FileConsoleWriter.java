package com.javarush.task.task19.task1917;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

/* 
Свой FileWriter
*/

public class FileConsoleWriter{
    
    public static void main(String[] args) {
    }

    private FileWriter fileWriter;
    
    public FileConsoleWriter(String string) throws IOException {
        fileWriter = new FileWriter(string);
    }
    public FileConsoleWriter(String string, boolean bln) throws IOException {
        fileWriter = new FileWriter(string, bln);
    }
    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }
    public FileConsoleWriter(File file, boolean bln) throws IOException {
        fileWriter = new FileWriter(file, bln);
    }
    public FileConsoleWriter(FileDescriptor fd) throws IOException {
        fileWriter = new FileWriter(fd);
    }
    
    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        
        for(int i = off; (i < off + len) || (i < cbuf.length); i++){
            System.out.print(cbuf[i]);
        }
    }
    
    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }
    
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }
    
    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, len));
    }
    
    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for(int i = 0; i < cbuf.length; i++){
            System.out.print(cbuf[i]);
        }
    }
    
    public void close() throws IOException{
        fileWriter.close();
    }
    
}

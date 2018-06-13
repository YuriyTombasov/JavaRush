package com.javarush.task.task20.task2011;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* 
Externalizable для апартаментов
*/
public class Solution {

    public static class Apartment implements Externalizable{

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String adr, int y) {
            address = adr;
            year = y;
        }

        /**
         * Prints out the fields. used for testing!
         * @return 
         */
        @Override
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput oo) throws IOException {
            oo.writeObject(address);
            oo.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
            address = (String) oi.readObject();
            year = oi.readInt();
        }
    }

    public static void main(String[] args) {

    }
}

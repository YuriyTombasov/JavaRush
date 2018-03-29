package com.javarush.task.task17.task1713;

import java.util.*;

/* 
Общий список
*/

public class Solution implements List<Long>{
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @Override
    public synchronized <T> T[] toArray(T[] ts) {
        return original.toArray(ts);
    }

    @Override
    public synchronized boolean add(Long e) {
        return original.add(e);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> clctn) {
        return original.containsAll(clctn);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> clctn) {
        return original.addAll(clctn);
    }

    @Override
    public synchronized boolean addAll(int i, Collection<? extends Long> clctn) {
        return original.addAll(i, clctn);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> clctn) {
        return original.removeAll(clctn);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> clctn) {
        return original.retainAll(clctn);
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int i) {
        return original.get(i);
    }

    @Override
    public synchronized Long set(int i, Long e) {
        return original.set(i, e);
    }

    @Override
    public synchronized void add(int i, Long e) {
        original.add(i, e);
    }

    @Override
    public synchronized Long remove(int i) {
        return original.remove(i);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int i) {
        return original.listIterator(i);
    }

    @Override
    public synchronized List<Long> subList(int i, int i1) {
        return original.subList(i, i1);
    }
 

}

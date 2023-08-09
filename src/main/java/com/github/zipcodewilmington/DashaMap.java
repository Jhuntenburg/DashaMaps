package com.github.zipcodewilmington;

import com.github.zipcodewilmington.create.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public abstract class DashaMap implements HashMapX{

    protected MyLinkedList[] dash;
    protected String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public DashaMap(){
        dash = new MyLinkedList[26];

        for (int i = 0; i < dash.length ; i++) {
            dash[i] = new  MyLinkedList("" + alphabet.charAt(i));

        }

    }
//    @Override
//    public void set(String key, String value) {
//
//    }

    @Override
    public Integer delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        for (MyLinkedList myLinkedList : dash){
            if(!myLinkedList.isEmpty()){
                return false;
            }
        }
        return true;
    }

    @Override
    public long size() {
        long totalSize = 0;
        for(MyLinkedList myLinkedList : dash){
            totalSize += myLinkedList.size();;
        }
        return totalSize;
    }

    @Override
    public int bucketSize(String key) {
        return dash[getBucketIndex(key)].size();
    }
    protected int getBucketIndex(String key){
        return alphabet.indexOf(key);
    }

    public abstract void set(String key, Integer value);
}


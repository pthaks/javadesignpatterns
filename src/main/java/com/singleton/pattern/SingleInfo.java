package com.singleton.pattern;

public class SingleInfo {

    //Below is the singleton class
    //It has 1 static object of the same class
    //It has 1 private constructor so that once cannot initiate other objects
    //It has 1 static get instance method which will return same static class object

    public static SingleInfo obj = new SingleInfo();
    public static int k=0;

    private SingleInfo(){
        System.out.println("Single Instance");
    };

    public static SingleInfo getInstance(){
        return obj;
    }

    public static void show(){
        System.out.println("Value of k : "+k);
    }
}

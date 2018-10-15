package com.alex.patterns.singleton.java;

public class SingletonJava {


    /*Static field*/
    public static final SingletonJava INSTANCE = new SingletonJava();



    /*Synchronized Accessor*/
    private static SingletonJava instance;

    public static synchronized SingletonJava getInstance() {
        if (instance == null) {
            instance = new SingletonJava();
        }
        return instance;
    }



    /*Double Checked Locking & volatile*/
    private static volatile SingletonJava instanceDoubleCheck;

    public static SingletonJava getInstanceDoubleCheck() {
        SingletonJava localInstance = instanceDoubleCheck;
        if (localInstance == null) {
            synchronized (SingletonJava.class) {
                localInstance = instanceDoubleCheck;
                if (localInstance == null) {
                    instanceDoubleCheck = localInstance = new SingletonJava();
                }
            }
        }
        return localInstance;
    }
}
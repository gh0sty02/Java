package com.pranay;

public class SingletonClass {
    public String name;

    private SingletonClass(String name) {
        this.name = name;
    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass("Hello");
        }

        return instance;
    }


}

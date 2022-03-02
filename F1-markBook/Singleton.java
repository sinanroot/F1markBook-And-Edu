package com.example.f1markbook;

public class Singleton {

    private F1mark sendF1mark;
    private static Singleton singleton;

    private Singleton() {



    }

    public F1mark getSendF1mark(){
        return sendF1mark;

    }


    public void  setSendF1mark(F1mark sendF1mark){
        this.sendF1mark = sendF1mark;

    }

    public static  Singleton getInstance() {

        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;


    }
}

package com.company;

public class Monkey extends Thread {

    String MonkeyName;
    int Age;
    String MonkeyType;

    @ Override
    public void run() {

        for(int i = 0; i < 100; i++){
            System.out.println("Monkey");
        }

    }

}

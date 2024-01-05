package com.samsung;

import com.samsung.service.Printer;
import com.samsung.threads.MyThread;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();

        Thread threadA = new Thread(new MyThread("A", printer));
        Thread threadB = new Thread(new MyThread("B", printer));
        Thread threadC = new Thread(new MyThread("C", printer));

        threadA.start();
        threadB.start();
        threadC.start();
    }
}

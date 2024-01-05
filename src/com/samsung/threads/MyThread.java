package com.samsung.threads;

import com.samsung.service.Printer;

public class MyThread implements Runnable {

    private String name;
    private Printer printer;

    private static String[] names = {"A", "B", "C"};
    private static int index = 0;


    public MyThread(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }


    @Override
    public void run() {

        while (true) {
            synchronized (printer) {
                try {
                    while (!name.equals(names[index])) {
                        printer.wait();
                    }
                    printer.printName(name);
                    index = (index + 1) % 3;
                    printer.notifyAll();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }

}
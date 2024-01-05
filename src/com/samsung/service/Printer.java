package com.samsung.service;

public class Printer {
    public synchronized void printName(String name) {
        System.out.println(name);
    }
}

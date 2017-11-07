package com.tutorialspoint.factoryPattern.color;

/**
 * Created by TOMATO601 on 2017-11-07.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

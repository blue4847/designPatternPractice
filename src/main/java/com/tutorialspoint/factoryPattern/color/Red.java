package com.tutorialspoint.factoryPattern.color;

/**
 * Created by TOMATO601 on 2017-11-07.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

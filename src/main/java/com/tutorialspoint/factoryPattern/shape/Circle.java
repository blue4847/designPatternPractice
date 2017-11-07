package com.tutorialspoint.factoryPattern.shape;

/**
 * Created by TOMATO601 on 2017-05-01.
 */
public class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Circle::draw() method.");
    }
}

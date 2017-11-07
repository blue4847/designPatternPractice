package com.tutorialspoint.factoryPattern.factory;

import com.tutorialspoint.factoryPattern.color.Color;
import com.tutorialspoint.factoryPattern.shape.Shape;

/**
 * Created by TOMATO601 on 2017-11-07.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}

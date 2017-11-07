package com.tutorialspoint.factoryPattern.factory;

import com.tutorialspoint.factoryPattern.shape.Circle;
import com.tutorialspoint.factoryPattern.shape.Rectangle;
import com.tutorialspoint.factoryPattern.shape.Shape;
import com.tutorialspoint.factoryPattern.shape.Square;

/**
 * Created by TOMATO601 on 2017-05-01.
 */
public class ShapeFactory {
    // use getShape method to get object of type shpae
    public Shape getShape(String shapeType) {
        // null check
        if (shapeType == null)
            return null;
        // return Shape class
        switch(shapeType.toUpperCase()){
            case "CIRCLE" : return new Circle();
            case "RECTANGLE" : return new Rectangle();
            case "SQUARE" : return new Square();
            default : return null;
        }
    }
}

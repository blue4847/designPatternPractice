package com.tutorialspoint.factoryPattern.factory;

import com.tutorialspoint.factoryPattern.shape.Shape;
import org.junit.Test;

/**
 * 팩토리 패턴은 자바에서 가장 자주 사용되는 패턴 중 하나이다. 
 * 이 유형의 디자인 패턴은 생성자 패턴하에 속하며 오브젝트를 생성하는데 가장 좋은 방법을 제공한다.
 * <p>
 * 팩토리 패턴에서, 오브젝트의 생성 로직은 클라이언트에 보이지 않으며, 새롭게 생성된 오브젝트는
 * 공용 인터페이스를 통해 취득한다.
 * @see <a href="https://www.tutorialspoint.com/design_pattern/factory_pattern.htm">FactoryPattern</a>
 */
public class ShapeFactoryTest {
    @Test
    public void getShape(){
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("circle");

        // call draw method of circle
        shape1.draw();

        // get and object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("rectangle");

        // call draw method of circle
        shape2.draw();

        // get and object of Rectangle and call its draw method.
        Shape shape3 = shapeFactory.getShape("square");

        // call draw method of circle
        shape3.draw();
    }
}

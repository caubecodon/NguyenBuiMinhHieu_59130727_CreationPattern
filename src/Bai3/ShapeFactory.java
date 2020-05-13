/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author nguye
 */
public class ShapeFactory {
    
    public Shape createShape(ShapeType shapeType, String brush, String paper, String frame) {
        if (shapeType == ShapeType.circle ) {return Circle.createCircle(brush, paper, frame);}
        if (shapeType == ShapeType.rectangle) {return Rectangle.createRectangle(brush, paper, frame);}
        if (shapeType == ShapeType.triangle) {return Triangle.createTriangle(brush, paper, frame);}
        return null;
    }
    
}

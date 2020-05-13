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
public class Triangle extends Shape {

    private static Shape triangle;

    protected Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    public static Shape createTriangle(String brush, String paper, String frame) {
        if (triangle == null) {
            triangle = new Triangle(brush, paper, frame);
        }
        return triangle;
    }
    
    @Override
    public String draw() {
        return "Hình tam giác: " + brush +","+ paper +","+ frame;
    }
    
    
}

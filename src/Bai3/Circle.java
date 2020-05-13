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
public class Circle extends Shape {

    private static Shape circle;//tao ra duy nhat 1 circle

    protected Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    
    
    public static Shape createCircle(String brush, String paper, String frame) {
        if (circle == null) {
            circle = new Circle(brush, paper, frame);
        }
        return circle;
    }
    
    @Override
    public String draw() {
        return "Hình tròn: " + brush +","+ paper +","+ frame;
    }
    
    
    
}

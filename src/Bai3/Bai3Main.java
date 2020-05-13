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
public class Bai3Main {
    public static void main(String[] args) {
        
        ShapeFactory factory = new ShapeFactory();
        
        Shape rect = factory.createShape(ShapeType.rectangle, "bút chữ nhật", "giấy chữ nhật", "thước chữ nhật");
        System.out.println(rect.draw());
        
        Shape circ = factory.createShape(ShapeType.circle, "bút tròn", "giấy tròn", "thước tròn");
        System.out.println(circ.draw());
        
        Shape tria = factory.createShape(ShapeType.triangle, "bút tam giác", "giấy tam giác", "thước tam giác");
        System.out.println(tria.draw());
    }
    
    
}

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
public class Rectangle extends Shape{

    private static Shape rectangle;

    protected Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
        //khoi tao co tham so
    }
    
    public static Shape createRectangle(String brush, String paper, String frame) {
        if (rectangle == null) {
            rectangle = new Rectangle(brush, paper, frame);//truyen tham so cho ham khoi tao
        }
        return rectangle;
    }
    
    
    
    @Override
    public String draw() {
        return "Hình chữ nhật: " + brush +","+ paper +","+ frame;
    }
    
    
}

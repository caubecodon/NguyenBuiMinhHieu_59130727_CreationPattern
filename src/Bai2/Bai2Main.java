/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author nguye
 */
public class Bai2Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder("Chuỗi ban đầu").addString(" + Thêm chuỗi s")
                                .addString(" + Thêm số s =").addFloat((float)1.1)
                                .addString(" + Thêm hàm Bool (true/false)").addBool(true);

        
//        str.addString("/n thử lại");
//        str.addString("/n");
//        str.addFloat((float) 2.5);
//        str.addBool(false);
        
        System.out.println(str.toString());
    }
}



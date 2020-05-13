/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Locale;

/**
 *
 * @author nguye
 */
public class Bai2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder("Chuỗi kí tự ")
            .addString("thêm chuỗi 1");
            
        System.out.println(str);
        //StringBuilder
    }

}

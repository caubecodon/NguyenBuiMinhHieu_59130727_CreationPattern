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
public class MyStringBuilder 
{
    String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }
    
    public MyStringBuilder addString(String s) {
        str = str + s;
        return this;
    }
    
    @Override
    public String toString() {
        return str;
    }


}
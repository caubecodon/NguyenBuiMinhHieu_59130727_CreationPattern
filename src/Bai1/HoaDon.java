/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;


/**
 *
 * @author nguye
 */
public class HoaDon {
    HoaDonHeader header;
    ArrayList<CTHD> dsCTHD;

    protected HoaDon(HoaDonBuilder builder) {
        this.header = builder.header;
        this.dsCTHD = builder.dsCTHD;
    }

    @Override
    public String toString() {
        String str = header.toString();
        for (CTHD ct : dsCTHD) {
            str = str + "\n" + ct.toString();
        }
        return str;
    }
    
    // builder class
    public static class HoaDonBuilder {
        HoaDonHeader header;
        ArrayList<CTHD> dsCTHD;
        

        public HoaDonBuilder setHeader(HoaDonHeader header) {
            this.header = header;
            return this;
        }

        
        public HoaDonBuilder setDsCTHD(ArrayList<CTHD> ds) {
            this.dsCTHD = ds;
            return this;
        }
        
        // build ra 1 hóa đơn
        public HoaDon build() {
            return new HoaDon(this);
        } 
        
    }
}
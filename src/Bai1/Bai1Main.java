/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class Bai1Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        
        HoaDonHeader header = new HoaDonHeader();
        header.setMaHoaDon("HD01");
        header.setNgayBan(formatDate.parse("12/5/2020"));
        header.setTenKH("Nguyen Van A");
        
        ArrayList<CTHD> dsCTHD = new ArrayList<>();
        CTHD ct1 = new CTHD();
        ct1.setSanPham("San pham 1");
        ct1.setSoLuong(3);
        ct1.setDonGia(100000);
        ct1.setChietKhau(5);       
        dsCTHD.add(ct1);
        
        CTHD ct2 = new CTHD();
        ct2.setSanPham("San pham 2");
        ct2.setSoLuong(2);
        ct2.setDonGia(200000);
        ct2.setChietKhau(10);
        dsCTHD.add(ct2);
        
        HoaDon hoaDon = new HoaDon.HoaDonBuilder()   
            .setHeader(header)
            .setDsCTHD(dsCTHD)
            .build();
        System.out.println(hoaDon.toString());
    }

    
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author nguye
 */
public class HoaDonHeader
{
    String maHoaDon;
    Date ngayBan;
    String tenKH;

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString()    
    {
        return "Thông tin chung: " + "Mã hóa đơn: " + maHoaDon + "; ngày bán: " 
                + new SimpleDateFormat("dd/MM/yyy").format(ngayBan) + "; tên KH: " + tenKH;
    }
    
}
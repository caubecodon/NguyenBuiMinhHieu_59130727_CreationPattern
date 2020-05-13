/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author nguye
 */
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    int chietKhau;

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }

    

    @Override
    public String toString() {
        return "CTHD: Sản phẩm: " + sanPham + ", số lượng: " + soLuong + ", đơn giá: " + donGia 
                + ", chiết khấu: " + chietKhau ;
    }
    
}

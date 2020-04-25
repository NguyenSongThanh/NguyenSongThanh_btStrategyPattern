/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.sosanh;

import java.util.Date;

/**
 *
 * @author SinhThonh
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;
    public SinhVien(){
        
    }
    public SinhVien(String hoTen, Date ngaySinh, float diemTB){
     this.hoTen=hoTen;
      this.ngaySinh=ngaySinh;
      this.diemTB=diemTB;
    }
    public String gethoten(){
     return hoTen;
    }
    public Date setngaysinh(){
     return ngaySinh;
    }
    public float getdiemtb(){
    return diemTB;
    }
    public String inTT(){
     return "họ tên: "+hoTen+" ngày sinh: "+ngaySinh+"\n"+"Điểm trung bình: "+diemTB;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.thanhtoan;

/**
 *
 * @author SinhThonh
 */
public class hanghoa {
    private String tenHH;
    private int gia;
    private String moTa;
    public hanghoa(){
    }
    public hanghoa(String tenHH, int gia, String moTa){
        this.tenHH = tenHH;
        this.gia=gia;
        this.moTa=moTa;
    }
    public String inHH(){
        return "tên hàng:"+tenHH+"giá:"+gia+"\n"+"mô tả:"+moTa;
        
    }
    public int setGia(){
        return gia;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.thanhtoan;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SinhThonh
 */
public class giohang {
    IThanhToan hinhthucTT;
    List<hanghoa> dsHH = new ArrayList<>();
    private int tienHang;
    public void setHinhThucTT(IThanhToan hinhthucTT){
        this.hinhthucTT = hinhthucTT;
    }
    public void indshh(){
        for(hanghoa HangHoa: dsHH){
            System.out.println(HangHoa.inHH());
        }
        System.out.println("Tiền hàng:"+tienHang);
    }
    public double setThanhToan(int tienHang){
        return hinhthucTT.thanhToan(tienHang);
    }
    public void themHH(hanghoa HangHoa){
        dsHH.add(HangHoa);
        tienHang = tienHang+HangHoa.setGia();
    }
    public int setTienHang(){
        return tienHang;
    }
}

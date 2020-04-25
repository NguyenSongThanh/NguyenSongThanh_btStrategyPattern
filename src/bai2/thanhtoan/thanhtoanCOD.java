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
public class thanhtoanCOD implements IThanhToan {

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang>2000000){
            return tienHang - (tienHang * 0.02);
      
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return tienHang;
    }
    
}

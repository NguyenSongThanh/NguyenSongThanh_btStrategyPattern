/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.sosanh;

/**
 *
 * @author SinhThonh
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.getdiemtb() < o2.getdiemtb()){
            return -1;
        }
        else
        if(o1.getdiemtb()==o2.getdiemtb()){
                return 0;
            }
        else
        if(o1.getdiemtb()>o2.getdiemtb()){
                return 1;}
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return 0;
    }
    
}

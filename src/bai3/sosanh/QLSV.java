/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.sosanh;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SinhThonh
 */
public class QLSV {
    List<SinhVien> dssv= new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    public void themsv(SinhVien sinhvien){
      dssv.add(sinhvien);
    }
    public void setSoSanh(ISoSanh<SinhVien> soSanh){
      this.soSanh=soSanh;
    }
    public ISoSanh<SinhVien> getSoSanh(){
    return soSanh;
    }
    public void SapXep(){
        SinhVien sinhvien=new SinhVien();
        for(int i=0; i < dssv.size(); i++)
        {
        for(int j=i+1; j<dssv.size(); j++){
        if(soSanh.soSanh(dssv.get(i), dssv.get(j))<=0){
          sinhvien=dssv.get(i);
          dssv.set(i,dssv.get(j));
          dssv.set(j,sinhvien);
        } 
         }
        }
                        }
    public void inds(){
        for(SinhVien sinhvien: dssv){
            System.out.println(sinhvien.inTT()+"\n");
        }
    }

}


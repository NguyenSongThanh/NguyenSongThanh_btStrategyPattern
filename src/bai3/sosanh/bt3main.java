/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.sosanh;


import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 *
 * @author SinhThonh
 */
public class bt3main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args)  throws ParseException{
    SimpleDateFormat ngs=new SimpleDateFormat("dd/MM/yyyy");
// TODO code application logic here
SinhVien nguoi1=new SinhVien("Bao thanh thiên",ngs.parse("07/05/2000"), 8.2f);
SinhVien nguoi2=new SinhVien("Bao chiển",ngs.parse("04/11/2003"), 9.2f);
SinhVien nguoi3=new SinhVien("Bao hồ nguyên",ngs.parse("15/06/1998"), 7.4f);
    QLSV dssv=new QLSV();
    dssv.themsv(nguoi1);
    dssv.themsv(nguoi2);
    dssv.themsv(nguoi3);
dssv.setSoSanh(new SoSanhTheoTen());
dssv.SapXep();
System.out.println("sắp xếp ds sinh viên theo tên"+"\n");
dssv.inds();

dssv.setSoSanh(new SoSanhTheoDiem());
dssv.SapXep();
System.out.println("sắp xếp ds sinh viên theo điểm"+"\n");
dssv.inds();
    }
    
}

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
public class mainbt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hanghoa sp1=new hanghoa("Táo", 80000, "Táo tàu");
        
        hanghoa sp2=new hanghoa("Đào", 65000, "Đào Tây Bắc");
        
        giohang gio1=new giohang();
        
        gio1.themHH(sp1);
        gio1.themHH(sp2);
        gio1.setHinhThucTT(new thanhtoanCOD());
        gio1.indshh();
        System.out.println("số tiền khách phải trả bằng hình thức COD:"+gio1.setThanhToan(gio1.setTienHang())+"\n");
        // TODO code application logic here
        giohang gio2=new giohang();
        
        gio2.themHH(sp1);
        gio2.themHH(sp2);
        gio2.setHinhThucTT(new thanhtoanonline());
        gio2.indshh();
        System.out.println("số tiền khách phải trả bằng hình thức online:"+gio2.setThanhToan(gio2.setTienHang())+"\n");
    }
    
}

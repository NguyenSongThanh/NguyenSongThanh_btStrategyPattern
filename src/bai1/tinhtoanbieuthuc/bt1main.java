/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.tinhtoanbieuthuc;

/**
 *
 * @author SinhThonh
 */
public class bt1main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context tong = new context();
        tong.setTinhToan(new Cong());
            System.out.println("tổng 75 và 12 ="+tong.tinh(75, 12));
        context hieu = new context();
        hieu.setTinhToan(new Tru());
            System.out.println("hiệu 54 và 78 ="+hieu.tinh(54, 78));
        
    }
    }
    


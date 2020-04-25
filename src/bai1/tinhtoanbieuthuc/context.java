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
public class context {
    private ITinh tinhtoan;
    public void setTinhToan(ITinh tinhtoan)
    {
        this.tinhtoan = tinhtoan;
    }
    public float tinh(float a, float b){
    return tinhtoan.tinh(a,b);
    }

}

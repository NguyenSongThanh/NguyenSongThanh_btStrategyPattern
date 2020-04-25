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
public class Chia implements ITinh {

    @Override
    public float tinh(float a, float b) {
        if(b==0)
        {
            System.out.println("khong the chia cho 0");
              return 0;
                   
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    else
            return a/b;
    }
    
    
}

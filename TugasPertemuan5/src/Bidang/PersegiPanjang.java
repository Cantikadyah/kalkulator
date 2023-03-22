/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidang;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements MenghitungBidang {
    public float p, l;

    public PersegiPanjang(float p, float l) {
        this.p = p;
        this.l = l;
    }

    @Override
    public double luas() {
       return p*l;
    }

    @Override
    public double keliling() {
       return 2*(p+l);
    }
}

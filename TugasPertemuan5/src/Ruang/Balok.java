/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ruang;
import Bidang.PersegiPanjang;
import Bidang.PesegiPanjang;
/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
   private float t;

    public Balok(float t, float p, float l) {
        super(p, l);
        this.t = t;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    
    
    @Override
    public double volume() {
      return super.luas()*getT();
    }

    @Override
    public double luasPermukaan() {
        return 2*(super.luas()+this.p*getT()+this.l*getT());
    } 
}

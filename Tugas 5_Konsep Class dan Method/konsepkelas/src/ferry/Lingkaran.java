/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferry;

/**
 *
 * @author SKANEDA
 */
public class Lingkaran {
    double jari_jari_ferry_gayo_pratama;
    double phi_ferry_gayo_pratama=3.14;
    
    Lingkaran(double jari_jari_ferry_gayo_pratama){
        this.jari_jari_ferry_gayo_pratama=jari_jari_ferry_gayo_pratama;
    }
    
    void setjari_jari(double jari_jari_ferry_gayo_pratama){
        this.jari_jari_ferry_gayo_pratama =jari_jari_ferry_gayo_pratama;
    }
    
    double getjari_jari() {
        return this.jari_jari_ferry_gayo_pratama;
    }
    
    double luaslingkaran() {
        return phi_ferry_gayo_pratama * jari_jari_ferry_gayo_pratama*jari_jari_ferry_gayo_pratama;
        
    }
    
    double kelilinglingkaran() {
        return 2*phi_ferry_gayo_pratama*jari_jari_ferry_gayo_pratama;
    }
}

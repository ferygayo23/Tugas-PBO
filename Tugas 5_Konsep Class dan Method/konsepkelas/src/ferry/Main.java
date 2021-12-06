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
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran_1_ferry_gayo_pratama= new Lingkaran(20);

        System.out.println("jari-jari dari lingkaran 1: " + lingkaran_1_ferry_gayo_pratama.getjari_jari());
        lingkaran_1_ferry_gayo_pratama.setjari_jari(40);
        System.out.println("jari-jari dari lingkaran 2: " + lingkaran_1_ferry_gayo_pratama.getjari_jari());
        
        System.out.println(lingkaran_1_ferry_gayo_pratama.kelilinglingkaran());
        System.out.println(lingkaran_1_ferry_gayo_pratama.luaslingkaran());
        
    }
}

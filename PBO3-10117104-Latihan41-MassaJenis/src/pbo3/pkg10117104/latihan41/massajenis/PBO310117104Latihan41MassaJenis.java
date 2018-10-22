/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan41.massajenis;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan Massa jenis dan volume 
 * dengan sisi dan masa nya telah di inisiasikan 
 * 
 */
public class PBO310117104Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    System.out.println("======Masa Jenis Kubus======");    
  
    kubus Kubus = new kubus();
    Kubus.setSisi(5);
    Kubus.setMassa(250);
    System.out.println("Sisi : "+Kubus.getSisi());
    System.out.println("Massa : "+Kubus.getMassa());
        System.out.println("");
        System.out.println("======Hasil Perhitungan=======");
    
    System.out.println("Volume : "+Kubus.hitungVolume(Kubus.getSisi()));
        System.out.println("Massa Jenis : "
                +Kubus.hitungMassaJenis
        (Kubus.getMassa(),Kubus.hitungVolume(Kubus.getSisi())));
    
    
    }
    
}

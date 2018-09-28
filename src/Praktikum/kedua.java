/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author acer
 */
public class kedua extends Pertama{
    private String noSekolah;
    
    public kedua (String noSekolah ,String nama , String ttl , String alamat , String email , String mapel){
        super(nama ,ttl, email , alamat , mapel);
        this.noSekolah = noSekolah;
    }
    public void info(){
        super.info();
        System.out.println("No hp        :"+this.noSekolah);
    }
    
}

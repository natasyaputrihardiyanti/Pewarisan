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
public class Pertama {
    private String nama ;
    private String ttl ;
    private String alamat ;
    private String email ;
    private String mapel ;
    
    public Pertama(String nama , String ttl , String alamat , String email , String mapel){
        this.nama = nama ;
        this.alamat = alamat ;
        this.email = email ;
        this.ttl = ttl ;
        this.mapel = mapel ;
    }
    public void info (){
        System.out.println("=================================================");
        System.out.println("                Data Guru                        ");
        System.out.println("=================================================");
        System.out.println(" Nama guru  : "+this.nama);
        System.out.println("TTL         : "+this.ttl);
        System.out.println("Alamat      : "+ this.alamat );
        System.out.println("Email       : "+this.email);
        System.out.println("Mapel       : "+this.mapel);
        
        
    }
       
}

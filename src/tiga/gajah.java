/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiga;

/**
 *
 * @author acer
 */
public class gajah extends Hewan {
    public static void testclassmethod(){
        System.out.println("The instance method in hewan..");
    }
    public void testinstancemethod(){
        System.out.println("The instance method in Gajah...")
                ;
    
    }
    public static void main (String[]args){
        gajah mygajah = new gajah ();
        Hewan myhewan = mygajah ;
        Hewan.testclassmethod();
        myhewan.testinstancemethod();
        
    }
    
}

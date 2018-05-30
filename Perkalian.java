/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

/**
 *
 * @author Fidha
 */
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalwhile=0;
        int nilai1=0;
        
        System.out.println("Tugas Membuat Perkalian 8");
        System.out.println("sssDengan while");
        while (nilai1 < 10){
            nilai1 = nilai1 + 1;
            totalwhile= nilai1 *8;
             System.out.println(nilai1 + " x 8 =" + totalwhile);
        }
        System.out.println("--------------");
        
            
    }
    
}

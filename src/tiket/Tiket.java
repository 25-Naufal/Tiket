/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author ASUS X450JN
 */
import java.util.Scanner;
public class Tiket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] tiket = {"bla","Sidoarjo - Malang ","Malang - Jakarta","Semarang - Jakarta"};
      int[] harga =  {100,15000, 150000, 200000};
      int pilih,bayar;
        Scanner input = new Scanner(System.in);
      
      
        System.out.println("--Tokped--");
      System.out.println("Anda berada di bagian tiket kereta api kelas ekonomi (8.15)");
      
      for (int i=1; i<harga.length;i++){
          System.out.println(i+". "+tiket[i]+" Seharga : Rp."+harga[i]);
      }
        
      System.out.println("Silahkan dipilih untuk tiketnya sesuai kebutuhan anda");
        pilih = input.nextInt();
    
        System.out.println("Yang anda pilih : "+tiket[pilih]);
        
        System.out.println("Masukkan nominal uang anda");
        bayar = input.nextInt();
        
       if(bayar > harga[pilih]){
             System.out.println("-----------------");
            System.out.println("Kembalian Rp."+(bayar - harga[pilih]) );
             System.out.println("-----------------");
             
        }else if (bayar == harga[pilih]){
             System.out.println("-----------------");
            System.out.println("Terimakasih");
             System.out.println("-----------------");
        }else{
            System.out.println("-----------------");
            System.out.println("Saldo anda kurang");
            System.out.println("-----------------");
        
            
            
            
            
            
        }
                
    }
    
    
    
      
    
}
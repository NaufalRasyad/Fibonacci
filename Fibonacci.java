/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;
import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlah = 0;
        System.out.print("Masukkan Angka : ");
        int angka = new Scanner(System.in).nextInt();
         int[] feb = new int[angka];
         feb[0] = 1;
         feb[1] = 1;
         for(int i=2; i < angka; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< angka; i++){
            jumlah=jumlah+feb[i];
         }
         System.out.println(jumlah);
    }
    
}



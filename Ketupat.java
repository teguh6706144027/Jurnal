/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ketupat;

/**
 *
 * @author Praktikan
 */
import java.util.Scanner;
public class Ketupat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int n;
       
        System.out.print("Masukkan Bilangan : "); n = input.nextInt();
       
       int a, b, c;

        a = 1; 
        c = n-1;
        
        for (int i = 0; i < n*2-1; i++){

                if (i < n){

                        for (int j=0; j<n*2-1; j++){

                                b = n - a;

                                if ((j < b) || (j >= (b + 2 * a - 1))){

                                        System.out.print(" ");

                                }

                                else{

                                        System.out.print("*");

                                }

                        }

                        a = a + 1;

                }else{

                        for (int j = 0; j < n * 2 - 1; j++){

                                b = n - c;

                                if ((j < b) || (j >= (b + 2 * c - 1))){

                                        System.out.print(" ");

                                }else{

                                        System.out.print("*");

                                }

                        }

                        c = c - 1;

                }

            System.out.println();

        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.kodingan;

/**
 *
 * @author Praktikan
 */
import java.util.Scanner;

public class JurnalKodingan {

    /**
     * @param args the command line arguments
     */
    
    public static int fibonacci(int n){
        
       
        if (n<=2){
            
            //System.out.print("1, ");
            return 1;
            
            
        }else{
            
            
            return (fibonacci(n-1) + fibonacci(n-2));
            
        }
        
    }
    
    public static void tampilFibonacci(int n){
        
         for (int i = 1; i<=n; i++){
            
            System.out.print(fibonacci(i) + ", ");
            
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int bil;
        
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
        
       tampilFibonacci(7);
        
    }
    
}

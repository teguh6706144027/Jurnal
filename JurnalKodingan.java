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

public class SumOfFibonacci {


    
    public static int fibonacci(int n){
        
       
        if (n<=2)
            return 1;
        else    
            return (fibonacci(n-1) + fibonacci(n-2));
          
        
    }
    
    public static int tampilFibonacci(int n){
        
        int total = 0;
         for (int i = 1; i<=n; i++){
             
           System.out.print(fibonacci(i) + ", ");
           total += fibonacci(i);
             
         }
            
            
        return total;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int bil;
        
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
        
       int tot = tampilFibonacci(7);
       System.out.println("");
        System.out.println("Total-nya Adalah : " + tot);
        
    }
    
}

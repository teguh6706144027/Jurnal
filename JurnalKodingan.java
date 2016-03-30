
package jurnal.kodingan;


import java.util.Scanner;

public class JurnalKodingan {

    
    public static int fibonacci(int n){
        
       
        if (n<=2)
            return 1;
        else
            return (fibonacci(n-1) + fibonacci(n-2));
        
    }
    
    public static void tampilFibonacci(int n){
        
         for (int i = 1; i<=n; i++)
            System.out.print(fibonacci(i) + ", ");
            
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int bil;
        
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
        
       tampilFibonacci(7);
        
    }
    
}

package Desafios;
import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
    
        int A = leitor.nextInt();
      
        int B = leitor.nextInt();
      
        if(A == B){
          System.out.print("Sao iguais!");
        }else{
          System.out.print("Nao sao iguais!");
        }
        leitor.close();
    }
}

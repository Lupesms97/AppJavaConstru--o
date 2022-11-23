package Desafios;
import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        int tamanaho = 1 + (N/A);
        int resultado = 0;
        
        for(int i = 1; i < tamanaho; i++){
            resultado = resultado + (A*i);
        }
        System.out.println(resultado);
        input.close();
    }
}


package Desafios;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
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
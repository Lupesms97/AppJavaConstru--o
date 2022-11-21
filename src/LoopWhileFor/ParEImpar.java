package LoopWhileFor;
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Digite até qual npumeero te informemos a quantidade de par e impar");
        int quantidadeDeNumeros = scan.nextInt();
       
        int quantPar;
        int qunatImpar;
        int count = 0;


        boolean encerrar = (count < quantidadeDeNumeros );

        do {
            System.out.println("Digite até qual npumeero te informemos a quantidade de par e impar");
            int numero = scan.nextInt();

            if (numero % 2 == 0) quantPar++;
            
            else qunatImpar++;

            count++;
            
        }while(encerrar);
        


        
    }   
}

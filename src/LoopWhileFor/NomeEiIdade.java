package LoopWhileFor;

import java.util.Scanner;

public class NomeEiIdade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Digite seu nome: ");
            String nome = scan.next();
            if(nome.equals("encerrar")) break;

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

        }
    
        System.out.println("Vamos finalizar seu programa");
        scan.close();
    }
    
}

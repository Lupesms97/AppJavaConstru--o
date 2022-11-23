package LoopWhileFor;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Digite seu nome: ");
            String nome = scan.next();
            if(nome.equals("encerrar")) break;

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

            System.out.println("Seu nome é "+ nome+" e sua idades é "+ idade +" anos");
        }
    
        System.out.println("Vamos finalizar seu programa");
        scan.close();
    }
    
}

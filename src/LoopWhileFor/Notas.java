package LoopWhileFor;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota de 0 a 10:");
        int nota = scan.nextInt();

        
        while(nota < 0 || nota > 10 ){
            System.out.println("A nota que você digitou é invalida");
            System.out.println("Digite sua nota de 0 a 10:");
            nota = scan.nextInt();
        }
        System.out.println("A nota qeevocê digitou é " + nota);
        scan.close();
    
    }

    

}

package LoopWhileFor;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o valor");
        int valorDias = scan.nextInt();

        int contadorAno = 0;
        int contadorMes = 0;
        int contadorDia = 0;

        while(valorDias > 365){
            valorDias -= 365;
            contadorAno++;
            while(30 <= valorDias && 365 >= valorDias){
                valorDias -= 30;
                contadorMes++;
                while(30 > valorDias){
                    valorDias -= 1;
                    contadorDia++;
                    if(valorDias ==0) break;
                }
            }
        }



        System.out.println("São "+contadorAno+" anos, "+contadorMes+" meses e "+contadorDia+" dias");
    }

}

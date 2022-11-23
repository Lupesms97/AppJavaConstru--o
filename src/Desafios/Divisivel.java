package Desafios;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Divisivel {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        boolean divisivelTres = num % 3 == 0;
        boolean divisivelCinco = num % 5 == 0;
        
        
        if(divisivelTres & divisivelCinco){
            System.out.println("FizzBuzz");
        }else if(divisivelCinco | divisivelTres){
            if(divisivelCinco==true){
                System.out.println("Buzz");
            }else if(divisivelTres==true){
                System.out.println("Fizz");
            }
        }else if(!divisivelCinco & !divisivelTres){
            System.out.println(num);
            
        }
        number.close();
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    }
}

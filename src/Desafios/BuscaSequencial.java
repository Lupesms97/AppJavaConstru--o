package Desafios;
import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        int X;

        Scanner input = new Scanner(System.in);
        X = input.nextInt();
  
        int count = -1;
        boolean inversao = true;

        for (int elemento : elementos) {
            count++;
            if(elemento!=X){     
            }else{
                System.out.println("Achei "+ X +" na posicao "+ count);  
                inversao = false;
            }
        }
        if(inversao == true){
            System.out.println("Numero "+ X +" nao encontrado!"); 
        }
        input.close();

        //Esse problema foi resolvido com uma gambiarra peço desculpas.

    }
}
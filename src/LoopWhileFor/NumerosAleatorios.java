package LoopWhileFor;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); 

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);
            numeros[i] = numero; 
        }

        System.out.print("Numeros: "); 
        for (int numero : numeros) {
            System.out.print(numero + " "); 
        }

        System.out.println("\n-----------------"); 

        System.out.print("Sucessores: ");
        for (int numero : numeros) { 
            System.out.print((numero + 1) + " "); 
        }
    }
}

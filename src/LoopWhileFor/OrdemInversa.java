package LoopWhileFor;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {8, 9, 0, -1, -4, 5}; 

        int count = (vetor.length - 1);
        System.out.print("Vetor Inverso: ");
        //loop
        while (count >= 0) { 
            System.out.print(vetor[count] + " "); 
            count--; 
        }

        System.out.println("\n--------------"); 
        System.out.print("Vetor: "); 
        for (int elemento : vetor) { 
            System.out.print(elemento + " "); 
        }
    }
}

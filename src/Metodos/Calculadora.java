package Metodos;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BackEndCaluladora backEndCaluladora =new BackEndCaluladora();
        

        boolean encerrar = true; 

        while(encerrar){
            System.out.println("Defina qual operação você deseja realizar \n [0]encerrar\n [1]Somar\n [2]subitrair\n [3]dividir\n [4]multiplicar\n");
            int resposta = scan.nextInt();

            if(resposta == 1){
                System.out.println("Digite o primeiro número que você deseja somar");
                int valor1 = scan.nextInt();
    
                System.out.println("Digite o o segundo número que você deseja somar");
                int valor2 = scan.nextInt();
    
                backEndCaluladora.somar(valor1, valor2);
            }else if(resposta == 2){
                System.out.println("Digite o primeiro número que você deseja somar");
                int valor1 = scan.nextInt();
    
                System.out.println("Digite o o segundo número que você deseja somar");
                int valor2 = scan.nextInt();
    
                backEndCaluladora.diminuir(valor1, valor2);
            }else if(resposta == 3){
                System.out.println("Digite o primeiro número que você deseja somar");
                int valor1 = scan.nextInt();
    
                System.out.println("Digite o o segundo número que você deseja somar");
                int valor2 = scan.nextInt();
    
                backEndCaluladora.dividir(valor1, valor2);
            }else if(resposta == 4){
                System.out.println("Digite o primeiro número que você deseja somar");
                int valor1 = scan.nextInt();
    
                System.out.println("Digite o o segundo número que você deseja somar");
                int valor2 = scan.nextInt();
    
                backEndCaluladora.multiplicar(valor1, valor2);
            }else if(resposta == 0){
                break;
            }
        System.out.println("O programa será encerrado");
        }
        

        scan.close();
    }
}

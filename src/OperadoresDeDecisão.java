import java.util.Locale;
import java.util.Scanner;

public class OperadoresDeDecisão {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Digite o primeiro valor da comparação: ");
        int variavel1 = scanner.nextInt();

        System.out.println("Digite o primeiro valor da comparação: ");
        int variavel2 = scanner.nextInt();

        if(variavel1 == variavel2) {
            System.out.println("A variavel 1 é igual");
        }else if(variavel1 > variavel2) {
            System.out.println("A variavel 1 é maior");
        }else {
            System.out.println("A variavel 1 é menor");
        }

    }

}


    
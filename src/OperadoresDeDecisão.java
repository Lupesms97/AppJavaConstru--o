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
            System.out.println("O numero "+ variavel1 +" é igual ao número "+ variavel2);
        }else if(variavel1 > variavel2) {
            System.out.println("O numero "+ variavel1 +" é mmaior que o número "+ variavel2);
        }else {
            System.out.println("O numero "+ variavel1 +" é menor que o número "+ variavel2);
        }

        System.out.println("Digite o primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobreNome = scanner.next();

        if(nome == "Felipe" && sobreNome == "Mota") {
            System.out.println("O seu nome é igual ao meu");
        }else if(nome == "Felipe" || sobreNome == "Mota" ) {
            System.out.println("Um dos seus nomes é igual ao meu");
        }else{
            System.out.println("Seus nomes são diferentes dos meus");
        }

        //Operadores ternarios
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        String tamanho  = (altura > 1.70? "Você é alto" : "Você é baixo");
        System.out.println(tamanho);
    }

}


    
package OperadoresDeRepeticao_;
import java.util.Locale;
import java.util.Scanner;


public class OperadoresdDecisao {
    
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

        //Não funciona a comparação por que não consegue comparar com os == precisa ser usando o equals
        //é necessário também criar a variavel com o nome para a comparação
        System.out.println("Digite o primeiro nome: ");
        String nome = scanner.next();
        String meuNome = "Felipe";

        System.out.println("Digite o seu sobrenome: ");
        String sobreNome = scanner.next();
        String meuSobreNome = "Mota";

        if(nome.equals(meuNome) && sobreNome.equals(meuSobreNome)) {
            System.out.println("O seu nome é igual ao meu");
        }else if(nome.equals(meuNome) || sobreNome.equals(meuSobreNome) ) {
            System.out.println("Um dos seus nomes é igual ao meu");
        }else{
            System.out.println("Seus nomes são diferentes dos meus");
        }

        //Operadores ternarios
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        String tamanho  = (altura > 1.70? "Você é alto" : "Você é baixo");
        System.out.println(tamanho);


        //Fazendo cauculos usando vareaiveis boleanas para estabelecer condições 
        System.out.println("Digite o seu salario: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite sua quantidade de filhos: ");
        int quantidadeFilhos = scanner.nextInt();

        double mediaSalario = 1250.00;
        int mediaFilhos = 2;

        boolean condicaoSalario = salario < mediaSalario;
        boolean condicaoFilho = quantidadeFilhos >= mediaFilhos;

        if(condicaoFilho && condicaoSalario){
            System.out.println("Esse funcionário deverá receber o auxílio");
        }else{
            System.out.println("Esse funcionário não deverá receber o auxílio");
        }


        //Fazendo o uso de switch


        System.out.println("Qual dia da semana é sua folga: ");
        String dia = scanner.next();

        switch(dia){
            case "segunda":
                System.out.println("Você digitou segunda-feira, mas é só no domingo");
                break;
            case "terça":
                System.out.println("Você digitou terça-feira, mas é só no domingo");
                break;
            case "quarta":
                System.out.println("Você digitou quarta-feira, mas é só no domingo");  
                break;             
            case "quinta":
                System.out.println("Você digitou quinta-feira, mas é só no domingo");     
                break;          
            case "sexta":
                System.out.println("Você digitou sexta-feira, mas é só no domingo");          
                break;     
            case "sabado":
                System.out.println("Você digitou sabado-feira, mas é só no domingo");      
                break;         
            case "domingo":
                System.out.println("Você digitou domingo, é isso ai ");
                break;
            default:
                System.out.println("Voc~e digitou um dia inválido");       
            }
            scanner.close();
        }

        
    }



    
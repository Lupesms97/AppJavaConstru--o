package DesafiosPOO.Herança.Exercicio2;

public class MainClasses {
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha01(), new ClasseFilha02(), new ClasseMae()};

        //Tirando a classe mae todos ocorreram polimorfismo
        for (ClasseMae classe : classes) {
            classe.metodo01();
        }

        System.out.println("");

        //Pela classe filha 01 não ter um metodo 02 ele chamou o metodo 02 da classe mae, classe do objeto de retorno
        for (ClasseMae classe : classes) {
            classe.metodo02();
        }

        //sobre escrita pois as classe do new w do objeto são iguais 
        ClasseFilha02 filha02 = new ClasseFilha02();
        filha02.metodo02();
        
    }
    
}

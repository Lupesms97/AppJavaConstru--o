package BancoConstrução;

/**
 * @author Luis Felipe Mota
 * @version 1.001
 * @since 2022/11/18
 * Documentação
 *
 */
public class Banco {

    public static void main(String[] args) {
        FuncaoBanco funcaoBanco = new FuncaoBanco();

        funcaoBanco.imprimirSaldo();

        funcaoBanco.sacar(100.00);

        funcaoBanco.depositar(350.00);




    }
    
}


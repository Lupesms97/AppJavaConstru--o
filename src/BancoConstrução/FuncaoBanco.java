package BancoConstrução;
public class FuncaoBanco {

static double saldo = 100.0;
    
    public void sacar(Double valor){
        double saque = saldo - valor;
        saldo = saque;
        System.out.println("O seu  novo saldo é de: " + saque);
    }

    public void depositar(double valor){
        double deposito = saldo + valor;
        saldo = deposito;
        System.out.println("O seu  novo saldo é de: " + deposito);
    }
    
    public void imprimirSaldo(){
        System.out.println(saldo);
    }




}

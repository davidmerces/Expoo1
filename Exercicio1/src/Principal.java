
import classes.ContaE;
import classes.ContaP;


public class Principal {

    
    public static void main(String[] args) {
        
        ContaP conta1 = new ContaP();
        conta1.setCliente("David Silva");
        conta1.setNum_conta("0325-9");
        conta1.setTaxa_rendimento(5.0);
        conta1.depositar(200);
        conta1.calcularNovoSaldo();
        conta1.dadosCliente();
        
        ContaE contae = new ContaE();
        contae.setCliente("Arthur Silva");
        contae.setNum_conta("2356-4");
        contae.depositar(200);
        contae.setLimite(100);
        contae.sacar(250);
        contae.dadosCliente();
    }
    
}

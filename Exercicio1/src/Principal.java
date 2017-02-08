
import classes.ContaP;


public class Principal {

    
    public static void main(String[] args) {
        
        ContaP conta1 = new ContaP();
        conta1.setCliente("David Silva");
        conta1.setNum_conta("0325-9");
        conta1.setSaldo(50);
        conta1.setTaxa_rendimento(5.0);
        conta1.depositar(200);
        conta1.calcularNovoSaldo();
        
    }
    
}

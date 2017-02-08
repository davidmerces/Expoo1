
package classes;

import static java.lang.Thread.sleep;


public class ContaBancaria {
    
    private String cliente;
    private String num_conta;
    private float saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(float valorS){
        
        if(saldo>=valorS){
            saldo -= valorS;
            System.out.println("RETIRE O DINHEIRO");
            sleep(1);
            System.out.println("SAQUE REALIZADO COM SUCESSO");
        }else{
            System.out.println("SALDO INSULFICIENTE");
        }  
    }
    
    public void depositar(float valorD){
        
        saldo = saldo + valorD;
        System.out.println("VALOR DEPOSITADO: R$"+valorD);
        
    }
    
    public void dadosCliente(){
        System.out.println("CLIENTE: "+cliente+"Nº");
    }
    
}

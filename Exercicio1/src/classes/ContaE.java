
package classes;

import static java.lang.Thread.sleep;


public class ContaE extends ContaBancaria {
    
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    /**
     *
     * @param valorS
     */
    @Override
    public void sacar(float valorS){
      float novoS=0;  
        if((super.getSaldo()+limite) >=valorS){
            novoS = (super.getSaldo()+limite)-valorS;
            super.setSaldo(novoS);
            System.out.println("RETIRE O DINHEIRO");
            System.out.println("SAQUE REALIZADO COM SUCESSO\n   LIMITE DISPONIVEL: "+novoS);
            limite = novoS;
        }else{
            System.out.println("SALDO INSULFICIENTE");
        }  
    }
}

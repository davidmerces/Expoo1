
package classes;



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
      System.out.println("SALDO COM LIMITE:R$ "+(super.getSaldo()+limite));
        if((super.getSaldo()+limite) >=valorS){
            novoS = (super.getSaldo()+limite)-valorS;
            if(super.getSaldo()- valorS < 0)
                super.setSaldo(0);
            System.out.println("SAQUE REALIZADO COM SUCESSO\n");
            limite = novoS;
        }else{
            System.out.println("SALDO INSULFICIENTE");
        }  
    }
    
    /**
     *
     */
    @Override
     public void dadosCliente(){
        System.out.println("CLIENTE: "+super.getCliente()+"\nNº DA CONTA:"+super.getNum_conta()+"\nSALDO COM LIMITE:R$ "+limite+"");

     }
}

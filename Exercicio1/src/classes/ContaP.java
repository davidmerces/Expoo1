
package classes;


public class ContaP extends ContaBancaria {
    
    private double taxa_rendimento;

    public double getTaxa_rendimento() {
        return taxa_rendimento;
    }

    public void setTaxa_rendimento(double taxa_rendimento) {
        this.taxa_rendimento = taxa_rendimento;
    }
    
    public void calcularNovoSaldo(){
        
        float rendimento = super.getSaldo()*(float)taxa_rendimento/100;
        rendimento = rendimento + super.getSaldo();
        System.out.println("SALDO ATUAL: R$"+super.getSaldo());
        super.setSaldo(rendimento);
        System.out.println("SALDO COM RENDIMENO: R$"+super.getSaldo());
    }
    
    
}

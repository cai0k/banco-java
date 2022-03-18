public class ContaBancaria{
    private String numero;
    private double saldo;
    
    
    public ContaBancaria(String numero, double saldo){
        this.saldo = saldo;
        this.numero = numero;
    }
    
    public String getNumero(){
        return numero;
    }


    public void setNumero(String numero){
        this.numero = numero;
    }


    public double getSaldo(){
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Debitar(){
         this.setSaldo(50);
         this.setNumero("35");
         if(saldo < 35){
             System.out.println("Saldo Insufuciente!!");
         }else{
            saldo = saldo - 35;
            System.out.println("Transção Aprovada! O saldo atual e de: " +saldo);
         }
        
        }
    public void Creditar(){
        this.setSaldo(20);
        this.setNumero("35");
        saldo = saldo + 35;
        System.out.println("O saldo atual e de: " +saldo);
        
    }
  
}
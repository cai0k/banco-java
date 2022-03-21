import java.util.Scanner;
public class ContaBancaria{
    private String numero;
    private double saldo;
    
    Scanner sc = new Scanner(System.in);

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

    public double Debitar(){
         this.setNumero("35");
         System.out.println("Digite o seu saldo: ");
         double saldo = sc.nextDouble();
         if(saldo < 35){
             System.out.println("Saldo Insufuciente!!");
         }else{
            saldo = saldo - 35;
            System.out.println("Transacao aprovada! seu saldo atual e de: "+saldo);
         }
        return saldo;
        
        }
    public double Creditar(){
        this.setNumero("35");
        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();
        saldo = saldo + 35;
        System.out.println("Seu saldo atual e de: "+saldo);
        return saldo;
        
    }
  
}
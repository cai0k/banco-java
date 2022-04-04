import java.util.Scanner;
public class ContaBancaria{
    private double numero;
    private double saldo;
    Scanner sc = new Scanner(System.in);
    

    public double getNumero(){
        return numero;
    }


    public void setNumero(double numero){
        this.numero = numero;
    }


    public double getSaldo(){
        return saldo;
    }


    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    
    public double Debitar(){
        System.out.println("Digite quanto deseja debitar: ");
         double numero = sc.nextDouble(); 
         if(saldo < numero){
             System.out.println("Saldo Insufuciente!!");
         }else{
            saldo = saldo - numero;
            System.out.println("Transacao aprovada! seu saldo atual e de: "+saldo);
         }
        return saldo;
        
        }
    public double Creditar(){
        System.out.println("Digite quanto deseja creditar: ");
        double numero = sc.nextDouble();
        saldo = saldo + numero;
        System.out.println("Seu saldo atual e de: "+saldo);
        return saldo;
        
    }


    
    
  
}
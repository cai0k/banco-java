import java.util.Scanner;
public class Aula {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);	
    int conta;
    ContaBancaria c1 = new ContaBancaria();
  
      System.out.println("-----------Seja bem vindo!!-----------");
      System.out.println("Para criar a sua conta digite: \n\n 1 - para criar uma conta prata \n 2 - para criar uma conta ouro \n 3 - para criar uma conta platina");
      conta = sc.nextInt(); 
      
  switch(conta){ 
          case (1):
          System.out.println("Conta prata criada com sucesso.");
          c1.setSaldo(150);
          break;
          
          case (2):
          System.out.println("Conta ouro criada com sucesso.");
          c1.setSaldo(250);
          break;
          
          
          case (3):
          System.out.println("Conta platina criada com sucesso.");
          c1.setSaldo(350);
          break;
          
      };
  c1.Debitar();
  c1.Creditar();
	}

}
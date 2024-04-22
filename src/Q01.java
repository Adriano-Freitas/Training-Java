import java.util.Scanner;

public class Q01 {
    
  public static void main(String[] Q01) {
      
    double mes, horas_trabalhadas;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
    horas_trabalhadas = leia.nextDouble();
    
    mes = horas_trabalhadas * 20;
    System.out.println("O seu salário é : " + mes + " R$ ");
    
    leia = null;
           
  }
  
}

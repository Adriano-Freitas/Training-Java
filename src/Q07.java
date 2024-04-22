import java.util.Scanner;

public class Q07 {
    
  public static void main(String[] Q07) {
      
    float altura, peso, imc;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe o peso: ");
    peso = leia.nextFloat();
    
    System.out.println("Informe à altura: ");
    altura = leia.nextFloat();
    
    imc = peso / (altura * altura);
    
    if(imc >= 30) {
      System.out.println("Obeso: " + imc);
    }
    else if(imc < 30) {
      System.out.println("Peso normal: " + imc);
    }
    
  }
  
}

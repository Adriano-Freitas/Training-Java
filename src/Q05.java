import java.util.Scanner;

public class Q05 {

  public static void main(String[] Q05) {
      
    float num1, num2;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe o primeiro número: ");
    num1 = leia.nextFloat();
    
    System.out.println("Informe o segundo número: ");
    num2 = leia.nextFloat();
    
    if(num1 > num2) {
      System.out.println("É maior número: " + num1);
    }
    else if(num2 > num1) {
      System.out.println("É maior número: " + num2); 
    }
    
  }
  
}

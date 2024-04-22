import java.util.Scanner;

public class Q10 {
  
  public static void main(final String[] Q10) {
    
    float num1, num2, soma;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe o primeiro número: ");
    num1 = leia.nextFloat();
    
    System.out.println("Informe o segundo número: ");
    num2 = leia.nextFloat();
    
    soma = num1 + num2;
    
    if(soma > 10) {
      System.out.println("A soma dos dois números é maior do que dez: " + soma);
    }
    else if(soma < 10) {
      System.out.println("Dez é maior que a soma dos dois números: " + soma); 
    }
    
    leia = null;
  }
  
}

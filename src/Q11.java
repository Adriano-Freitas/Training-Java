import java.util.Scanner;

public class Q11 {
  
  public static void main(final String[] Q11) {
    
    float num1, num2, soma, somado, subtraido;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe o primeiro número: ");
    num1 = leia.nextFloat();
    
    System.out.println("Informe o segundo número: ");
    num2 = leia.nextFloat();
    
    soma = num1 + num2;
    
    if(soma >= 10) {
        somado = soma + 5;
        System.out.println("A soma dos dois números é: " + somado);
    }
    else if(soma < 10) {
        subtraido = soma - 7;
        System.out.println("A subtração dos dois números é: " + subtraido); 
    }
    
    leia = null;
  }
  
}
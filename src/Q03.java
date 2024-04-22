import java.util.Scanner;

public class Q03 {

  public static void main(String[] Q03) {
      
    int idade;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe a sua idade: ");
    idade = leia.nextInt();
    
    System.out.println((idade >= 18) ? "Pode tirar carteira de motorista: " + idade : " Não está apto: " + idade);
  }    
}

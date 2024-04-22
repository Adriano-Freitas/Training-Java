import java.util.Scanner;

public class Q04 {
    
  public static void main(String[] Q04) {
      
    int febre;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Digite a sua temperatura do corpo: ");
    febre = leia.nextInt();
    
    System.out.println((febre >= 37) ? "O paciente está com febre: " + febre : " Sua Temperatura está normal: " + febre);
  }
}
 
import java.util.Scanner;

public class Q06 {

  public static void main(String[] Q06) {
      
    float nota1, nota2, trabalho, media;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe primeira nota: ");
    nota1 = leia.nextFloat();
    
    System.out.println("Informe a segunda nota: ");
    nota2 = leia.nextFloat();
    
    System.out.println("Informe a nota do trabalho: ");
    trabalho = leia.nextFloat();
    
    media = (nota1 + nota2 + trabalho) / 3;
    
    if(media >= 7) {
      System.out.println("Aprovado: " + media);
    }
    else if(media < 7) {
      System.out.println("Reprovado: " + media);
    }
    
  }
  
}

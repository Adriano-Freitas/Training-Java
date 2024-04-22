import java.util.Scanner;

public class Q08 {
 
  public static void main(String[] Q08) {
  
    double raio, area;
    final double pi = 3.14;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe o raio da circunferência: ");
    raio = leia.nextFloat();
    
    area = pi * (raio * raio);
    System.out.println("À area da circunferência é : " + area);
    
  }   
}
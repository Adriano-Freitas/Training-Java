import java.util.Scanner;

public class Q02 {
  
  public static void main(String[] Q02) {
      
    double distancia, gasolina, preco_litro, valor;
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Informe a distância pecorrida: ");
    distancia = leia.nextDouble();
    
    gasolina = distancia /  12;
    System.out.println("A quantidade de gasolina que será preciso é: " + gasolina + " litros ");
    
    System.out.println("Informe o preço da gasolina: ");
    preco_litro = leia.nextDouble();
    
    valor = preco_litro * gasolina;
    System.out.println("O valor a pagar de combustivel RS: " + valor);
  }
}

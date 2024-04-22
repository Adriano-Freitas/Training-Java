import java.util.Scanner;

public class Q09 {
    
  public static void main(String[] Q09) {
      
    float sal_liquido, val_hor, horas_trabalhadas, percentual, sal_bruto;
    Scanner leia = new Scanner(System.in);
    
    //System.out.println("Informe o salário bruto: ");
    //sal_bruto = leia.nextFloat();
    
    System.out.println("Informe quantidades de horas trabalhadas no mês: ");
    horas_trabalhadas = leia.nextFloat();
    
    System.out.println("Informe o valor hora aula: ");
    val_hor = leia.nextFloat();
    
    System.out.println("Informe o desconto do INSS: ");
    percentual = leia.nextFloat();
    
    sal_bruto = (val_hor * horas_trabalhadas);
    sal_liquido = sal_bruto - ((percentual / 100) * sal_bruto);
    
    System.out.println("O seu salário bruto: " + sal_bruto);
    
    System.out.println("O seu salário liquído: " + sal_liquido);
    
    leia = null;
  }
}
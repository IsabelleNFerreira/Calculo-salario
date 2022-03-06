// Programa para calcular novos salario de acordo com a porcentagem

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException 
    {
        Scanner varInput = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00"); // formato para booleana com 2 digitos após a virgula
        System.out.print("Digite o salário: ");
        double salarioInicial = varInput.nextDouble();
        double salarioFinal = 0.00;
        double reajuste = 0.00;
        double porcentagem = 0.00; // porcentagem como double para calcular reajuste
        int prct = 0; // porcentagem como inteiro para impressão
        
        if (salarioInicial >= 0 && salarioInicial <= 400 ){
            porcentagem = 0.15;
            reajuste = CalcularReajuste(salarioInicial, porcentagem); // chamada do metodo de reajuste e atribuição dos parametros 
            salarioFinal = CalcularNovoSalario(reajuste, salarioInicial); // chamada do metodo de reajuste e atribuição dos parametros
            prct = 15;
        }
          else if (salarioInicial > 400 && salarioInicial <=  800 ){
            porcentagem = 0.12;
            reajuste = CalcularReajuste(salarioInicial, porcentagem);
            salarioFinal = CalcularNovoSalario(reajuste, salarioInicial);
            prct = 12;
          }
            else if (salarioInicial > 800 && salarioInicial <=  1200 ){
              porcentagem = 0.10;
              reajuste = CalcularReajuste(salarioInicial, porcentagem);
              salarioFinal = CalcularNovoSalario(reajuste, salarioInicial);
              prct = 10;
            }
              else if (salarioInicial > 1200 && salarioInicial <= 2000 ){
                porcentagem = 0.07;
                reajuste = CalcularReajuste(salarioInicial, porcentagem);
                salarioFinal = CalcularNovoSalario(reajuste, salarioInicial);
                prct = 7;
              }
                else if (salarioInicial > 2000.00 ){
                  porcentagem = 0.04;
                  reajuste = CalcularReajuste(salarioInicial, porcentagem);
                  salarioFinal = CalcularNovoSalario(reajuste, salarioInicial);
                  prct = 4;
                }
        // Imprime o reajuste e novo salario no formato informado anteriomente
        System.out.println("Reajuste ganho: " + dc.format(reajuste));
        System.out.println("Novo salario: " + dc.format(salarioFinal));
        System.out.println("Em percentual: " + prct + " %");
    }

    // método para calcular o reajuste de acordo com as variaveis informadas
    public static double CalcularReajuste(double salInicial, double porc)
    {
      double reajuste = salInicial*porc;
      return reajuste;
    }

     // método para calcular o novo salario de acordo com as variaveis informa
    public static double CalcularNovoSalario(double reajuste, double salInicial)
    {
      double NovoSal = salInicial+reajuste;
      return NovoSal;
    }
}
package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, kwConsumido;
        double valorKW, valorTotal, valorComDesconto;
        // final double TAXA_POR_KW = 500; // constant = não pode ser alterado
        
        // entrada
        System.out.println("Digite o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Digite o consumo em KW:");
        kwConsumido = entrada.nextDouble();

        // processamento
        // cada KW custa 1 / 500 do salário mínimo
        // valorKW = salarioMinimo / TAXA_POR_KW;
        //valorComDesconto = valorTotal - valorTotal * 0.15;
        valorKW = salarioMinimo / 500;
        valorTotal = valorKW * kwConsumido;
        valorComDesconto = valorTotal * 0.85;

        // saída
        // System.out.println("O valor, em reais, de cada quilowatt: " + valorKW);
        // System.out.println("O valor, em reais, a ser pago por essa residência: " + valorTotal);
        // System.out.println("O valor, em reais, a ser pago com desconto de 15%: " + valorComDesconto);
        System.out.println("1 Kw custa: " + valorKW);
        System.out.println("Valor Total: " + valorTotal);
        System.out.println("Valor com 15% de desconto: " + valorComDesconto);

        entrada.close();
    } 
}

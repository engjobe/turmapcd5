package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo, kwConsumo;
        double valorKW, valorTotal, valorComDesconto;
        
        // entrada
        System.out.println("Digite o valor do salário mínimo:");
        salarioMinimo = entrada.nextDouble();

        System.out.println("Digite a quantidade de quilowatts consumida:");
        kwConsumo = entrada.nextDouble();

        // processamento
        valorKW = salarioMinimo / 500;
        valorTotal = valorKW * kwConsumo;
        valorComDesconto = valorTotal - valorTotal * 0.15;

        // saída
        System.out.println("O valor, em reais, de cada quilowatt: " + valorKW);
        System.out.println("O valor, em reais, a ser pago por essa residência: " + valorTotal);
        System.out.println("O valor, em reais, a ser pago com desconto de 15%: " + valorComDesconto);

        entrada.close();
    } 
}

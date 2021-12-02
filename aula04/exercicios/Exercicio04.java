package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioBruto, prestacao, limite;

        System.out.println("Digite o salário bruto:");
        salarioBruto = entrada.nextDouble();
        System.out.println("Digite o valor da prestação:");
        prestacao = entrada.nextDouble();

        limite = salarioBruto * 0.3;

        // if (prestacao <= salarioBruto * 0.3) {
        if (prestacao <= limite) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo reprovado!");
        }

        entrada.close();
    }
}

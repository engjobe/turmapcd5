package exercicios;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.println("Informe a nota:");
        nota = entrada.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else {
            if (nota >= 5) {
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");
            }
        }

        entrada.close();

    }
}

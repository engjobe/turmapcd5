package exercicios;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.println("Informe a nota:");
        nota = entrada.nextDouble();

        if (nota < 7.0) {
            if (nota >= 5) {
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Aprovado");
        }

        entrada.close();

    }

}

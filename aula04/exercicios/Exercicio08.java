package exercicios;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, inss;

        System.out.println("Informe o salário");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Isento");
        } else if (salario > 600 && salario <= 1200) {
            inss = salario * 0.2;
            System.out.println(inss);
        } else if (salario > 1200 && salario <= 2000) {
            inss = salario * 0.25;
            System.out.println(inss);
        } else {
            inss = salario * 0.3;
            System.out.println(inss);
        }
        entrada.close();

    }

}

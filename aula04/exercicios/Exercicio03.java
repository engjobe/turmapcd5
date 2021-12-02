package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Digite o número 1:");
        numero1 = entrada.nextDouble();
        System.out.println("Digite o número 2:");
        numero2 = entrada.nextDouble();

        if(numero1 < numero2) {
            // System.out.println(numero1 + ", " + numero2);
            System.out.printf("%d, %d\n", numero1, numero2);
        } else {System.out.println(numero2 + ", " + numero1);

        }

        entrada.close();  
    }
    
}

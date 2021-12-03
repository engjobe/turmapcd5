import java.util.Scanner;

public class Bee1003 { // Main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, soma;

        System.out.println("Digite 2 valores inteiros:"); // saída de dados para o usuário ler
        n1 = entrada.nextInt(); // pede para digitar um valor inteiro // entrada de dados variável A
        n2 = entrada.nextInt(); // pede para digitar um valor inteiro // entrada de dados variável B

        soma = n1 + n2;

        System.out.println("SOMA = " + soma); // saída de dados // resultado da SOMA

        entrada.close();
    }
}
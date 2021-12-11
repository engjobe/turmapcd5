import java.util.Scanner;

public class Bee1117 { // Main
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota;
        double soma = 0;
        int cont = 0; // onde começa a numeração

        while (cont != 2) {
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota; // soma = soma + nota // a = a + b, fazemos a += b
                cont++; // soma um na variável cont // cont = cont + 1
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f\n", (soma / cont)); // soma / 2

        entrada.close();
    }
}
import java.io.IOException;
import java.util.Scanner;

public class Bee1064 { // Main

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double valor, media = 0;
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            valor = entrada.nextDouble();
            if (valor > 0) {
                cont++;
                media += valor;
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

        entrada.close();
    }

}
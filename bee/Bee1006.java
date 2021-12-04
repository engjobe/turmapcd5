import java.util.Locale;
import java.util.Scanner;

public class Bee1006 { // Main
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, media;

        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();

        media = n1 * 0.2 + n2 * 0.3 + n3 * 0.5;

        System.out.printf("MEDIA = %.1f\n", media);

        entrada.close();

    }
}
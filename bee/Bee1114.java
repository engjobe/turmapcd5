import java.util.Scanner;

public class Bee1114 { // Main
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int senha;

        senha = entrada.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = entrada.nextInt();
        }
        
        System.out.println("Acesso Permitido");

        entrada.close();
    }
}
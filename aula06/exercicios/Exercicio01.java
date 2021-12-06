package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        boolean resultado;

        resultado = ehPar(11);

        if (resultado) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Impar");
        }
    }

    public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

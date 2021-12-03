package exemplos;

public class Exemplo02 {

    public static void main(String[] args) {
        int cont;

        cont = 1;

        while (cont < 10) {
            System.out.print(cont + " "); // print sem ln, não pula para próxima linha
            cont++; // soma um na variável cont
            // cont = cont + 1; // mesma coisa do comando acima
            // cont += 2; // soma dois na variável cont
            // cont = cont + 2; // mesma coisa do comando asima
        }

        System.out.println("Final: " + cont);
    }

}

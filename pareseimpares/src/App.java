import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int quantPares = 0;
        int quantImpares = 0;
        int numero;
        int count = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }

            count++;

        } while (count < quantNumeros);

        System.out.println("Pares..: " + quantPares);
        System.out.println("Impares: " + quantImpares);
        System.out.println("Total..: " + quantNumeros);
    }
}

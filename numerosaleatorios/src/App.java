import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Antecessor Números: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\n...........Números: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero) + " ");
        }

        System.out.print("\nSucessores Números: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}

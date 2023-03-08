import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int taboada;

        System.out.println("Informe Taboada Desejada: ");
        taboada = scan.nextInt();

        System.out.println("Processando taboada do: " + taboada + " ... ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + taboada + " = " + (i * taboada));
        }
    }
}

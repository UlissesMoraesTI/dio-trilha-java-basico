import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.println("Informe Fatorial Desejado: ");
        fatorial = scan.nextInt();

        System.out.println("Processando Fatorial de: " + fatorial + " ... ");

        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println("Fatorial !" + fatorial + " = " + multiplicacao);
    }
}

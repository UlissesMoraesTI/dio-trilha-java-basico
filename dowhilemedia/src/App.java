import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do {
            System.out.println("Informe Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count++;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / count));

    }

}

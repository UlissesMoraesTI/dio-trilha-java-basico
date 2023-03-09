import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {

        int[] vetor = { -5, -6, 15, 50, 8, 4 };
        int count = 0;
        int i = 0;

        while (count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        for (i = (vetor.length - 1); i >= 0; i--) {
            System.out.println("Vetor: " + vetor[i] + " indice: " + i);
        }
    }
}
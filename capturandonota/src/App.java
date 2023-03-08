import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Informe nota do Aluno: ");
        nota = scan.nextInt();

        while (true) {

            if (nota >= 0 && nota <= 10)
                break;

            System.out.println("Entre com uma nota válida: ");
            nota = scan.nextInt();

        }

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Aluno em recuperação");
                break;
            case 5:
            case 6:
                System.out.println("Passou raspando!");
                break;
            case 7:
                System.out.println("Boa nota!");
                break;
            case 8:
            case 9:
                System.out.println("Ótima nota!");
                break;
            case 10:
                System.out.println("Excelente nota!");
                break;
            default:
                System.out.println("Nota Indefinida!");
                break;
        }

    }
}

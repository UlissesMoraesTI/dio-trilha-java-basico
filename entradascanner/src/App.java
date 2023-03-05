import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe Nome:");
        String nome = scanner.next();

        System.out.println("Informe SobreNome:");
        String sobreNome = scanner.next();

        System.out.println("Informe Idade:");
        int idade = scanner.nextInt();

        System.out.println("Informe Altura:");
        double altura = scanner.nextDouble();

        System.out.println("Me chamo " + nome + " " + sobreNome + ", tenho " + idade + " anos de idade e " + altura
                + " cm de altura.");
    }
}

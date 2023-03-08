import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Informe Nome:");
        nome = scan.next();

        System.out.println("Informe Idade:");
        idade = scan.nextInt();

        System.out.println("Meu nome é " + nome + ", e eu tenho " + idade + " anos de idade.");

    }
}

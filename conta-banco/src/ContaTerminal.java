import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco," +
            " sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double saldo = 523;
        System.out.print("Por favor, insira seu nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Por favor, insira seu número: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, insira o número da agência: ");
        int agencia = sc.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d,\n" +
                        "conta %d e seu saldo %.2f já se encontra disponível para saque.",
                nome, agencia, numero, saldo);






        sc.close();
    }
}
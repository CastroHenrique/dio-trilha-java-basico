import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta !");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite nome do Cliente!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite nome o Saldo!");
        saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}

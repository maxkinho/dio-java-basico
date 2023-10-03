import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        double saldo = 10.00;
        String agencia;
        int numeroConta;
        String nomeCliente;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o seu nome em 'CAIXA ALTA'.");
        nomeCliente = scanner.nextLine();
        System.out.println("Pro favor digite o número de sua agência com 4 digitos seguindo o padrão XXX-X.");
        agencia = scanner.nextLine();
        System.out.println("Por favor digite o número de sua conta com 4 digitos seguindo o padrão XXXX.");
        numeroConta = scanner.nextInt();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta" + numeroConta + "e seu saldo " + saldo +" já está disponível para saque.");
        
    }
}


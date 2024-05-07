import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
     
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt","BR"));
       
//Solicita digitação do nome do cliente

        System.out.print("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();

 //Solicita digitação do número da agência

        System.out.print("Informe o número da agência: ");
        int numeroAgencia = scanner.nextInt();

//Solicita digitação da agência

        scanner.nextLine();
        System.out.print("Informe a agência: ");
        String agencia = scanner.nextLine();

//expecifica o valor do saldo em conta

        double saldo = 500.00;

//Retorna as informações informados pelo usário

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.\n",nomeCliente, args);
        System.out.printf("Sua agência é %d, conta %s e seu saldo no valor de %.2f já está disponivel para saque.",numeroAgencia, agencia, saldo);
        scanner.close();

    }
} 
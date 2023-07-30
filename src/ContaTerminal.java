import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        final String banco = """
        d = depositar
        s = sacar""";

        System.out.println(banco);
        
        // Loop para ler a opção do usuário
        while (true) {
            System.out.println("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("d")) {
                System.out.println("Você escolheu depositar.");
                System.out.println("qual valor voce deseja depositar:");
                double deposit = scanner.nextDouble();
                System.out.println("voce depositou "+deposit);
                // Aqui você pode implementar a lógica para o depósito
                break; // Sai do loop após a escolha correta
            } else if (opcao.equals("s")) {
                System.out.println("Você escolheu sacar.");
                System.out.println("qual valor deseja sacar?");
                double saque = scanner.nextDouble();
                System.out.println("voce saquou "+ saque);
                // Aqui você pode implementar a lógica para o saque
                break; // Sai do loop após a escolha correta
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

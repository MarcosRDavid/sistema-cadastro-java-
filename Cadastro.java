import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== Sistema de Cadastro ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Opção inválida. Digite um número: ");
                scanner.next();
            }

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();

                System.out.print("Digite a idade: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Idade inválida. Digite um número: ");
                    scanner.next();
                }
                int idade = scanner.nextInt();
                scanner.nextLine();

                usuarios.add("Nome: " + nome + " | Idade: " + idade);
                System.out.println("\nUsuário cadastrado com sucesso!");

            } else if (opcao == 2) {

                if (usuarios.isEmpty()) {
                    System.out.println("\nNenhum usuário cadastrado.");
                } else {
                    System.out.println("\n=== Usuários Cadastrados ===");
                    for (String usuario : usuarios) {
                        System.out.println(usuario);
                    }
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}

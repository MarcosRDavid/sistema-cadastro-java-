import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("=== Sistema de Cadastro ===");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        if (opcao == 1) {
            System.out.print("Digite o nome: ");
String nome = scanner.nextLine();

System.out.print("Digite a cidade: ");
String cidade = scanner.nextLine();


            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.println("\nUsuário cadastrado com sucesso!");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Cidade: " + cidade);
        } else {
            System.out.println("Programa finalizado.");
        }

        scanner.close();
    }
}
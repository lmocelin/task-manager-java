import service.TarefaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TarefaService tarefaService = new TarefaService();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Marcar tarefa como concluída");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o título da tarefa: ");
                String titulo = scanner.nextLine();

                tarefaService.adicionarTarefa(titulo);

            } else if (opcao == 2) {

                tarefaService.listarTarefas();

            } else if (opcao == 3) {

                tarefaService.listarTarefas();

                System.out.print("Digite o número da tarefa que deseja concluir: ");
                int indice = scanner.nextInt();
                scanner.nextLine();

                tarefaService.concluirTarefa(indice);

            } else if (opcao == 4) {

                tarefaService.listarTarefas();

                System.out.print("Digite o número da tarefa que deseja remover: ");
                int indice = scanner.nextInt();
                scanner.nextLine();

                tarefaService.removerTarefa(indice);

            } else if (opcao == 0) {

                System.out.println("Saindo do sistema...");

            } else {

                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
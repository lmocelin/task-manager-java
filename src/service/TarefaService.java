package service;

import model.Tarefa;

import java.util.ArrayList;

public class TarefaService {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String titulo) {

        Tarefa novaTarefa = new Tarefa(titulo);

        tarefas.add(novaTarefa);

        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i));
        }
    }

    public void concluirTarefa(int indice) {

        if (indice < 0 || indice >= tarefas.size()) {
            System.out.println("Tarefa não encontrada.");
            return;
        }

        tarefas.get(indice).concluir();

        System.out.println("Tarefa marcada como concluída!");
    }

    public void removerTarefa(int indice) {

        if (indice < 0 || indice >= tarefas.size()) {
            System.out.println("Tarefa não encontrada.");
            return;
        }

        tarefas.remove(indice);

        System.out.println("Tarefa removida com sucesso!");
    }
}
import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {
        // Criar uma lista para armazenar nomes
        List<String> listaNomes = new ArrayList<>();

        // Adicionar nomes à lista
        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Charlie");
        listaNomes.add("David");

        // Imprimir a lista de nomes
        System.out.println("Lista de Nomes:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Verificar se a lista contém um nome específico
        String nomeProcurado = "Bob";
        if (listaNomes.contains(nomeProcurado)) {
            System.out.println(nomeProcurado + " está na lista.");
        } else {
            System.out.println(nomeProcurado + " não está na lista.");
        }

        // Remover um nome da lista
        String nomeRemovido = "Charlie";
        listaNomes.remove(nomeRemovido);
        System.out.println("Removido: " + nomeRemovido);

        // Imprimir a lista atualizada
        System.out.println("Lista de Nomes Atualizada:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Obter o tamanho da lista
        int tamanhoDaLista = listaNomes.size();
        System.out.println("Tamanho da Lista: " + tamanhoDaLista);

        // Verificar se a lista está vazia
        boolean listaVazia = listaNomes.isEmpty();
        System.out.println("A lista está vazia? " + listaVazia);

        // Limpar a lista (remover todos os elementos)
        listaNomes.clear();
        System.out.println("Lista limpa.");

        // Verificar novamente se a lista está vazia
        listaVazia = listaNomes.isEmpty();
        System.out.println("A lista está vazia? " + listaVazia);
    }
}


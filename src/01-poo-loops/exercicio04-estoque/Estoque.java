package PooLoops01.exercicio04estoque;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    String busca = "";

    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");

    }

    public void listarProdutos() {
        for (Produto produto : listaProdutos){
            System.out.println("Produto: " + produto.getNome() + " Quantidade: " + produto.getQuantidade());
        }

    }

    public void buscarProduto(String busca){
        boolean encontrado = false;

        for (Produto prod : listaProdutos){
            if(prod.getNome().equalsIgnoreCase(busca)){
                System.out.println("Encontrado: " + prod.getNome() + " Quantidade: " + prod.getQuantidade());
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Produto não encontrado.");
        }


    }
}

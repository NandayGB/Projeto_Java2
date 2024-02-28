package ecommerce.controller;

import java.util.ArrayList;
import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class Produtocontroller implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();


    @Override
    public void criarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("\nO Produto " + produto.getNome() + " foi criado.");
    }

    @Override
    public void listarProdutos() {
        for (Produto produto : listaProdutos) {
            produto.visualizar(); 
        }
    }

    @Override
    public void consultarProdutoPorId(int numero) {
        Produto produto = buscarNaCollection(numero);

        if (produto != null)
            produto.visualizar();
        else
            System.out.println("\nO Produto ID " + numero + " não foi encontrado!");
    }

    @Override
    public void atualizarProduto(Produto produto) {
        Produto buscaProduto = buscarNaCollection(produto.getId());

        if (buscaProduto != null) {
            listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
            System.out.println("\nO Produto com ID " + produto.getId() + " foi atualizado com sucesso!");
        } else
            System.out.println("\nO Produto com ID " + produto.getId() + " não foi encontrado.");
    }

    @Override
    public void deletarProduto(int numero) {
        Produto produto = buscarNaCollection(numero);

        if (produto != null) {
            if (listaProdutos.remove(produto)) {
                System.out.println("\nO Produto ID " + numero + " foi apagado com sucesso!");
            } else {
                System.out.println("\nO Produto ID " + numero + " não foi encontrado!");
            }
        } else {
            System.out.println("\nO Produto ID " + numero + " não foi encontrado!");
        }
    }

    public Produto buscarNaCollection(int numero) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == numero) {
                return produto;
            }
        }
        return null;
    }
}
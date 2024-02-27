package ecommerce;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.Panelas;
import ecommerce.controller.Produtocontroller;
import ecommerce.model.Frigideiras;
import ecommerce.util.Cores;


public class Menu {

    public static void main(String[] args) {

    	
		Produtocontroller produtos = new Produtocontroller();
    	Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.println("\u001B[35m-----------------------------------------------------");
            System.out.println("\u001B[35m                                                     ");
            System.out.println("\u001B[35m                  NANDAY PANELAS                     ");
            System.out.println("\u001B[35m                                                     ");
            System.out.println("\u001B[35m--------------------------------------------\u001B[0m");
            System.out.println("\n\u001B[34m============== Menu Principal ============\u001B[0m");
            System.out.println("\u001B[34m            1 - Criar Produto                         ");
            System.out.println("\u001B[34m            2 - Listar Todos os Produtos             ");
            System.out.println("\u001B[34m            3 - Consultar Produto por ID             ");
            System.out.println("\u001B[34m            4 - Atualizar Produto                    ");
            System.out.println("\u001B[34m            5 - Deletar                               ");
            System.out.println("\u001B[34m            6 - Sair                                  ");
            System.out.println("\u001B[34m                                                     ");
            System.out.println("\u001B[35m--------------------------------------------\u001B[0m");
            System.out.print("\u001B[34m Opção desejada: ");

            opcao = leia.nextInt();

            if (opcao == 6) {
                System.out.println("\nObrigado por escolher a NANDAY PANELAS!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
            
                case 1:
                	System.out.println("Criar Produto\n\n");
                    System.out.println("Digite o ID do Produto: ");
                    int id = leia.nextInt();
                    System.out.println("Digite o Nome do Produto: ");
                    leia.nextLine(); 
                    String nome = leia.nextLine();
                    System.out.println("Digite o Tipo do Produto (1-Panela ou 2-Frigideira): ");
                    int tipo = leia.nextInt();
                    System.out.println("Digite o Preço do Produto R$");
                    float preco = leia.nextFloat();

                    if (tipo == 1) {
                        produtos.criarProduto(new Panelas(id, nome, tipo, preco, "Aço Inox"));
                    } else if (tipo == 2) {
                        produtos.criarProduto(new Frigideiras(id, nome, tipo, preco, "Ferro"));
                    } else {
                        System.out.println("Tipo de produto inválido.");
                    }
                    keyPress();
                    break;
                    
                case 2:
                    System.out.println("Listar Todos os Produtos\n\n");
                    produtos.listarProdutos();
                    keyPress();
                    break;
                    
           
                case 3:
                	
                    System.out.println("Consultar Produtos - por ID\n\n");
                    System.out.println("Digite o ID do Produto: ");
                    int numero = leia.nextInt();
                    produtos.consultarProdutoPorId(numero);
                    keyPress();
                    break;
                    
                case 4:
                    System.out.println("Atualizar Produto\n\n");
                    System.out.println("Digite o ID do Produto: ");
                    numero = leia.nextInt();

                    var buscaProduto = produtos.buscarNaCollection(numero);

                    if (buscaProduto != null) {
                        tipo = buscaProduto.getTipo();

                        System.out.println("Digite o Novo Nome do Produto: ");
                        leia.nextLine(); // Limpa o buffer do teclado
                        nome = leia.nextLine();
                        System.out.println("Digite o Novo Preço do Produto R$");
                        preco = leia.nextFloat();

                        if (tipo == 1) {
                            produtos.atualizarProduto(new Panelas(numero, nome, tipo, preco, "Aço Inox"));
                        } else if (tipo == 2) {
                            produtos.atualizarProduto(new Frigideiras(numero, nome, tipo, preco, "Ferro"));
                        }
                    } else {
                        System.out.println("\nO Produto com ID " + numero + " não foi encontrado.");
                    }
                    keyPress();
                    break;
                    
                case 5:
                		System.out.println("Deletar Produto\n\n");
                		System.out.println("\nDigite o ID do Produto: ");
                    numero = leia.nextInt();
                    produtos.deletarProduto(numero);
                    
                    keyPress();
                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
                    keyPress();
                    break;
            }
        }
    }	  
          
    private static void keyPress() {
		try {

			System.out.println("\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
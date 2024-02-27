package ecommerce;

import java.util.Scanner;

import ecommerce.model.Panelas;
import ecommerce.model.Frigideiras;
import ecommerce.model.Produto;

import ecommerce.util.Cores;


public class Menu {

    public static void main(String[] args) {

    	Produto a1 = new Produto(123, "frigideira de ferro", 1, 100.00f);
		a1.visualizar(); 
		
    	
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
                   
                    break;
                case 2:
                    System.out.println("Listar Todos os Produtos\n\n");
                   
                    break;
                case 3:
                    System.out.println("Consultar Produtos - por ID\n\n");
                   
                    break;
                case 4:
                    System.out.println("Atualizar Produto\n\n");
                    
                    break;
                case 5:
                    System.out.println("Deletar Produto\n\n");
                    
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}
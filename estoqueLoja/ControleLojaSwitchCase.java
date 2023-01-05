package estoqueLoja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleLojaSwitchCase {
    //public class SwitchCase{
        public static void main(String[] args) {
            List<String> estoque = new ArrayList<String>();
            //adiciona itens na lista
            estoque.add("Camiseta");
            estoque.add("Vestido");
            estoque.add("Bota");
            Scanner entrada = new Scanner(System.in);
            int opcao;

            while(true){
                System.out.println("Digite um número de 0 a 3 onde:");
                System.out.println("1- Visualizar os itens em estoque");
                System.out.println("2- Adicionar novos itens");
                System.out.println("3- Remover itens do estoque");
                System.out.println("0- Sair");
                opcao = entrada.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("Listagem do estoque " + estoque);
                        break;
                }
                switch (opcao){
                    case 2:
                        Scanner adicionar = new Scanner(System.in);
                        String itens;
                        System.out.println("O que você quer adicionar? ");
                        itens = adicionar.next();

                        break;

                    case 3:
                        Scanner remover = new Scanner(System.in);
                        String itens2 = null;
                        System.out.println("O que você quer remover? ");
                        itens = String.valueOf(remover.nextInt());
                        estoque.remove(itens2);
                        break;

                    case 0:
                        System.out.println("Obrigado e ate mais.");
//					System.exit(0) encerra o programa, sem nenhuma mensagem de erro
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Digite um numero do menu");
                        break;
                }
            }

        }
    }
//}

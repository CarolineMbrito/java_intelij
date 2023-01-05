package estoqueLoja;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {
    public static void main(String[] args) {

        List<String> estoque = new ArrayList<String>();
        //adiciona itens na lista
        estoque.add("Camiseta");
        estoque.add("Vestido");
        estoque.add("Bota");

        //antes de atualizar
        System.out.println("Listagem do estoque antes de atualizar " + estoque);

        //atualiza itens da lista
        estoque.remove("Bota");
        estoque.add("Coturno");
        System.out.println("Listagem do estoque depois de atualizar " + estoque);

        //mostra itens na lista
        //System.out.println("Listagem do estoque " + estoque);

        //editando um item da lista buscando pelo nome dele
        estoque.set(estoque.indexOf("Camiseta"),"Camisa");
        System.out.println("Listagem do estoque depois de atualizar 2.0 " + estoque);

        estoque.remove(1);
        System.out.println("Listagem do estoque depois de deletar um item " + estoque);


    }
}

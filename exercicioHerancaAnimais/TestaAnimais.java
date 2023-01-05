package exercicioHerancaAnimais;
import exercicioHerancaAnimais.Animal;
import exercicioHerancaAnimais.Cachorro;
import exercicioHerancaAnimais.Cavalo;
import exercicioHerancaAnimais.Preguica;
public class TestaAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Mathias",1,"Latido","Sob as 4 patas");
        Cavalo cavalo = new Cavalo("Beau",5,"Relinchado","Sob os cascos");
        Preguica preguica = new Preguica("Lilo",10,"Gritos","Movem-se devagar","Sobe em ávores");

        //cachorro.setSom("Latido");
        //cavalo.setSom("Relinchar");
        //preguica.setSom("Balbucios");

        System.out.println("Caracteríticas de animais");
        System.out.println("Cachorro: " + cachorro.getSom());
        System.out.println("Cavalo: " + cavalo.getSom());
        System.out.println("Bicho Preguiça: " + preguica.getSom());
        System.out.println("Bicho Preguiça: " + preguica.getEscalar());
    }
}

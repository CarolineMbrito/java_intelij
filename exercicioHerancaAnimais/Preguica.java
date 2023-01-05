package exercicioHerancaAnimais;
import exercicioHerancaAnimais.Cavalo;
public class Preguica extends Cavalo{

    private String escalar;

    public Preguica(String nome, int idade, String som, String corrida, String escalar){
        super(nome, idade, som, corrida);
        this.escalar=escalar;
    }
    public String getEscalar() {
        return escalar;
    }

    public void setEscalar(String escalar) {
        this.escalar = escalar;
    }
}

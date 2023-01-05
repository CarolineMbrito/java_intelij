package exercicioHerancaAnimais;

import exercicioHerancaAnimais.Animal;

    public class Cachorro extends Animal{

        private String corrida;

        public Cachorro(String nome, int idade, String som, String corrida){
            super(nome, idade, som);
            this.corrida=corrida;

        }
        public Cachorro(){}

        public String getCorrer() {
            return corrida;
        }

        public void setCorrer(String correr) {
            this.corrida = correr;
        }
    }


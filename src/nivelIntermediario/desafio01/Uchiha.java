package nivelIntermediario.desafio01;

public class Uchiha extends Ninja {

        String habilidadeEspecial;


        public void mostrarHabilidadeEspecial() {
            System.out.println("A habilidade especial é: " +habilidadeEspecial);
        }

        @Override
        public void mostrarInformacoes() {
            super.mostrarInformacoes();
            mostrarHabilidadeEspecial();
        }
}

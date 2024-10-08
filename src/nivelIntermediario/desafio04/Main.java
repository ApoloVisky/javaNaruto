package nivelIntermediario.desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico naruto = new NinjaBasico("Naruto Uzimaki", 17, "Gostar de gozar", TipoHabilidade.NINJUTSU);
        naruto.mostrarInformacoes();

        NinjaAvancado sasuke = new NinjaAvancado("Sasuke", 20, "Gozada maxima", TipoHabilidade.RINNEGAN);
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();
        sasuke.especialidade();
    }
}

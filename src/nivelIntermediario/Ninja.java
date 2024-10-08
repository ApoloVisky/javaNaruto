package nivelIntermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;


    public void sharinganAtivado () {
        System.out.println("Sharingan Ativado");
    }

    public int idadeMinimaParaHokage (int idadeMinima) {
        return idadeMinima - idade;
    }
}

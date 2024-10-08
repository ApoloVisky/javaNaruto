package nivelIntermediario.generics;

public class Kunai {
    private String nome;


    @Override
    public String toString() {
        return "Kunai [nome=" + nome + "]";
    }

    public Kunai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package nivelIntermediario.generics;

public class Pergaminho {
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Pergaminho{" + "tamanho=" + tamanho + '}';
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Pergaminho(int tamanho) {
        this.tamanho = tamanho;
    }
}

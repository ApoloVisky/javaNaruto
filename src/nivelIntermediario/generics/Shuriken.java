package nivelIntermediario.generics;

public class Shuriken {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Shuriken [tipo=" + tipo + "]";
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Shuriken(String tipo) {
        this.tipo = tipo;
    }
}

package nivelIntermediario.generics;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramentas(new Kunai("kunai ninja"));
        bolsaNinja.adicionarFerramentas(new Pergaminho(3));
        bolsaNinja.adicionarFerramentas(new Shuriken("Suriken pica"));

        bolsaNinja.consultarBolsa();
    }
}

package nivelIntermediario.desafio04;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome
        + "\nIdade: " + idade
        + "\nHabilidade: " + habilidade
        + "\nTipoHabilidade: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade: " + habilidade);
    }
}

package nivelIntermediario.desafio04;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public NinjaAvancado(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome
        + "\nIdade: " + idade
        + "\nHabilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade: " + habilidade);

    }

    public void especialidade() {
        System.out.println("Ataque especial da pica grossa");
    }

}

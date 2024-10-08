package nivelIntermediario.desafio01;

public class Main {
    public static void main(String[] args) {
        Uchiha uchiha = new Uchiha();

        uchiha.nome = "Sasuke Uchiha";
        uchiha.idade = 18;
        uchiha.missao = "Reconhecimento";
        uchiha.nivelDificuldade = "S";
        uchiha.statusMissao = "Incompleta";
        uchiha.habilidadeEspecial = "Rei do Secso"; 

        uchiha.mostrarInformacoes();
    }
}

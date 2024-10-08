package nivelFacil.IfElse;

public class Ternario {
    public static void main(String[] args) {

        //Ternário
        // variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        int nivelMissao = 8 ;

        String nivelDoNinja = (nivelMissao >= 9) ? "O nivel da missao é maior que 9" : "O nivel da missao é menor que 9";

        System.out.println(nivelDoNinja);
    }
}

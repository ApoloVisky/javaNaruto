package nivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();


        naruto.nome = "Naruto";
        naruto.idade = 20;
        naruto.aldeia = "Aldeia da folha";

         naruto.sharinganAtivado();

         int idadeFalta = naruto.idadeMinimaParaHokage(70);
         System.out.println("Faltam " +idadeFalta+ "anos para se tornar hokage");
    }
}

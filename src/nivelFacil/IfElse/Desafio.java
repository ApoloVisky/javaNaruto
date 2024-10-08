package nivelFacil.IfElse;

public class Desafio {
    public static void main(String[] args) {
        Desafio desafio = new Desafio();

        desafio.Ninja1();
        desafio.Ninja2();
        desafio.Ninja3();



    }

    public void Ninja1(){
        String nome = "Naruto";
        int idade = 15;
        String missao = "Buscar Suprimentos";
        char nivelDificuldadeMissao = 'S';
        boolean statusMissao = false;


        if(idade < 15 && (nivelDificuldadeMissao == 'C' || nivelDificuldadeMissao == 'D' )) {
            System.out.println("Missão concluida");
            statusMissao = true;
        }else if(idade >= 15){
            System.out.println("Missão concluida");
            statusMissao = true;
        }else{
            System.out.println("Missão não concluida");
        }

        System.out.println("-------Ninja 1---------");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldadeMissao);
        System.out.println(statusMissao);


    }

    public void Ninja2(){
        String nome = "Sasuke";
        int idade = 19;
        String missao = "Rastreamento";
        char nivelDificuldadeMissao = 'A';
        boolean statusMissao = false;



        if(idade < 15 && (nivelDificuldadeMissao == 'C' || nivelDificuldadeMissao == 'D') ) {
            System.out.println("Missão concluida");
            statusMissao = true;
        }else if(idade >= 15){
            System.out.println("Missão concluida");
            statusMissao = true;
        }else{
            System.out.println("Missão não concluida");
        }

        System.out.println("-------Ninja 2---------");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldadeMissao);
        System.out.println(statusMissao);
    }

    public void Ninja3(){
        String nome = "Gaara";
        int idade = 14;
        String missao = "Proteger a Vila";
        char nivelDificuldadeMissao = 'S';
        boolean statusMissao = false;



        if(idade < 15 && (nivelDificuldadeMissao == 'C' || nivelDificuldadeMissao == 'D' )) {
            System.out.println("Missão concluida");
            statusMissao = true;
        }else if(idade >= 15){
            System.out.println("Missão concluida");
            statusMissao = true;
        }else{
            System.out.println("Missão não concluida");
        }

        System.out.println("-------Ninja 3---------");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldadeMissao);
        System.out.println(statusMissao);
    }








}

package nivelIntermediario.desafio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
        public static void main(String[] args) {
                List<Ninja> listDeNinjas = new ArrayList<>();

                Scanner sc = new Scanner(System.in);
                int escolha = 0;

            listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
                listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
                listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
                listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
                listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
                listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
                listDeNinjas.add(new Ninja("Temari", 18, "Areia"));




                do {
                        System.out.println("---------Ninjas---------");
                        System.out.println("1 - Adicionar mais ninjas na lista");
                        System.out.println("2 - Mostrar todos os ninjas na lista");
                        System.out.println("3 - Remover o primeiro ninja na lista");
                        System.out.println("4 - Acessar um ninja em qualquer posição");
                        System.out.println("5 - Sair do programa");
                        System.out.print("Digite a opção que desejar: ");
                        escolha = sc.nextInt();

                        if (escolha == 1){
                            System.out.println("Digite o nome do ninja que deseja adicionar: ");
                            String ninja = sc.next();
                            System.out.println("Qual a idade: ");
                            int idadeNInja = sc.nextInt();
                            System.out.println("Qual a aldeia: ");
                            String aldeiaNinja = sc.next();
                            listDeNinjas.add(new Ninja(ninja, idadeNInja, aldeiaNinja));
                        } else if (escolha == 2){
                            System.out.println("Lista completa de Ninjas: ");
                            for (Ninja ninja : listDeNinjas) {
                                System.out.println(ninja);
                            }
                        }else if (escolha == 3){
                            System.out.println("Removendo o Ninja: "+listDeNinjas.get(0));
                            listDeNinjas.removeFirst();

                        } else if (escolha == 4){
                            System.out.println("A quantidade de ninjas na lista é de "+listDeNinjas.size());
                            System.out.println("Digite a posição que deseja acessar: ");
                            int posicaoNinja = sc.nextInt();
                            System.out.println("Ninja:" +listDeNinjas.get(posicaoNinja));
                        }

                } while (escolha != 5);

                if (escolha == 5){
                        System.out.println("Programa finalizado com sucesso!");
                }





        }
}


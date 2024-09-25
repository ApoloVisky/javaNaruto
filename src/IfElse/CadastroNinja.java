package IfElse;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        ArrayList<String> listaNinja = new ArrayList<>();

        while (option != 3) {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (digite somente números): ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o nome do ninja que deseja adicionar: ");
                    String nome = scanner.nextLine();
                    listaNinja.add(nome);
                    break;
                case 2:
                    for (String ninja : listaNinja) {
                        System.out.println("Ninjas: " + ninja);

                    }
            }
        }
        if (option == 3) {
            System.out.println("Saindo da aplicação!");
        }
        scanner.close();

    }

}


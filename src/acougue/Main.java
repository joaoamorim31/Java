package acougue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Bovinos> ca = new ArrayList<>();
        ca.add(new Bovinos(2219,"Patinho", 200, 41.90));


        //Criando instancias de carne
        Bovinos acem = new Bovinos(2040,"Acem",300, 32.90);
        acem.setDescricao("Boa carga de otima qualidade!");

        Bovinos patinho = new Bovinos(2219, "Patinho", 150, 41.90);

        Bovinos paleta = new Bovinos(2102,"Paleta", 200,35.90);
        paleta.setDescricao("Venciamento curto 'PRIORIDADE' !");

        Bovinos picanha = new Bovinos(2233, "Picanha", 10, 62.90);
        picanha.setDescricao("ATENÇÃO a validade");



        //Menu
        Scanner scanner = new Scanner(System.in);

        System.out.println("***MENU***");


        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite o Codigo: ");
            int codigoCarne = scanner.nextInt();




            switch (codigoCarne) {
                case 2024:
                    System.out.println("Acem Fatiado: R$" + String.format("%.2f",acem.preco));
                    break;
                case 2233:
                    System.out.println("Picanha Bovina: R$" + String.format("%.2f",picanha.preco));
                    break;
                case 2102:
                    System.out.println("Paleta Bovina: R$" +String.format("%.2f",paleta.preco));
                case 2219:
                    System.out.println("Patinho Bovino: R$" +String.format("%.2f",patinho.preco));
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Codigo Invalido!");



            }
        }



    }
}

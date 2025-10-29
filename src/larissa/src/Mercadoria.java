package larissa.src;

import java.util.Scanner;

public class Mercadoria {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scan.nextLine();

        System.out.println("Digite o valor do produto: ");
        double precoProduto = scan.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        int quantidade = scan.nextInt();

        double total = precoProduto * quantidade;

        System.out.println("O valor total é igual a: " + total);

        scan.close();
    }
}
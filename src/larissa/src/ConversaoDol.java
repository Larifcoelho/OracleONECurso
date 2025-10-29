package larissa.src;

import java.util.Scanner;

public class ConversaoDol {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        double cotacao = 5.35;

        System.out.println("Digite a quantidade de dolares que deseja converter: ");
        double valorEmDolares = scan.nextDouble();
        double reais = valorEmDolares * cotacao;

        System.out.printf("US$ %.2f equivalem a R$ %.2f%n", valorEmDolares, reais);

        scan.close();
    }
}


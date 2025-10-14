package larissa.src;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número é descubra se ele é positivo ou negativo: ");
        int n = scan.nextInt();

        if (n > 0){
            System.out.println("O número " + n + " é positivo");
        } else {
            System.out.println("O número " + n + " é negativo");
        }


    }
}

package larissa.src;

import java.util.Scanner;

public class MediaNotas {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insire duas notas e obtenha a média ");

        System.out.println("Nota A: ");
        double nA = scan.nextDouble();

        System.out.println("Nota B: ");
        double nB = scan.nextDouble();

        double media = (nA + nB) / 2;


        System.out.println("A média calculada é de: " + media);

        scan.close();
    }
}

package larissa.src;

import java.util.Scanner;

public class IntInformes {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um primeiro número: ");
        int n1 = scan.nextInt();

        System.out.println("Digite um segundo número: ");
        int n2 = scan.nextInt();

        if (n1 != n2 ){
            System.out.println("Os números são diferentes");
        } else {
            System.out.println("Os números são iguais");
        }

        if ( n1 > n2 ){
            System.out.println("O número " + n1 + " é maior que " + n2 );
        } else {
            System.out.println("O número " + n2 + " é maior que o " + n1);
        }
    }
}

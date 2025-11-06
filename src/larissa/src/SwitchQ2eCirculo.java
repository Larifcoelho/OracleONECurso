package larissa.src;

import java.util.Scanner;

public class SwitchQ2eCirculo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1. Calcular área do quadrado.");
        System.out.println("2. Calcular área do círculo.");
        System.out.println("3. Para sair.");
        int resposta = scan.nextInt();

        switch (resposta){
            case 1:
                System.out.println("Digite a medida do lado do quadrado: ");
                double q2 = scan.nextDouble();
                double total = q2 * q2 ;
                System.out.println("A área do quadrado é: " + total);
                break;

            case 2:
                System.out.println( "Digite o raio do círculo: ");
                double raio = scan.nextDouble();
                double area = Math.PI * Math.pow (raio, 2);
                System.out.println("A área do círculo é de: " + area);
                break;

            case 3:
                System.out.println("Finalizando o programa...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        scan.close();
    }

}


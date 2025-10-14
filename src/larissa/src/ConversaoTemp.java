package larissa.src;

import java.util.Scanner;

public class ConversaoTemp {
    public static void main (String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        int fahrenheitInt = (int) fahrenheit;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura inteira em Fahrenheit: " + fahrenheitInt);


    }
}

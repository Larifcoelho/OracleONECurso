package larissa.src;

public class Desconto {
    public static void main (String [] args){

        String vasoura;
        double precoOriginal = 10.99;
        double desconto = 0.5 ;
        double total = precoOriginal - (precoOriginal * desconto);

        System.out.println("Preço final com desconto: " + total);


    }
}

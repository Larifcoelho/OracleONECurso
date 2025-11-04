package ControleDeContaBancaria;

public class Main {
    public static void main (String [] args){

        Conta minhaConta = new Conta("Larissa", 1000);

        Deposito dep = new Deposito();
        Saque sq = new Saque();
        VerSaldo vs = new VerSaldo();

        vs.mostrarSaldo(minhaConta);

        dep.Deposito(minhaConta, 200);
        vs.mostrarSaldo(minhaConta);

        sq.sacar(minhaConta, 150);
        vs.mostrarSaldo(minhaConta);

        ConsultaTitular ct = new ConsultaTitular();
        ct.mostrarTitular(minhaConta);

    }
}

package ControleDeContaBancaria;

public class Saque {
    public void sacar (Conta conta, double valor){
        conta.saldo = conta.saldo - valor;
        System.out.println("Saque de " + valor + "realizado!");
    }
}

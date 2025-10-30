package ControleDeContaBancaria;

public class Deposito {
    public void Deposito ( Conta conta, double valor){
        conta.saldo = conta.saldo + valor;
        System.out.println("Depósito de " + valor + "realizado!");

    }
}

package com.andre.kotlin_overview;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de R$1000.0
        ContaBancaria minhaConta = new ContaBancaria(1000.0);

        // Realizando algumas operações
        minhaConta.verificarSaldo();
        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);
        minhaConta.verificarSaldo();
        minhaConta.sacar(1500.0); // Tentando sacar mais do que o saldo disponível

        // Criando outra conta bancária com saldo inicial de R$500.0
        ContaBancaria outraConta = new ContaBancaria(500.0);

        // Realizando algumas operações na segunda conta
        outraConta.verificarSaldo();
        outraConta.sacar(100.0);
        outraConta.depositar(300.0);
        outraConta.verificarSaldo();
    }
}
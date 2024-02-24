// Exemplo simples de sistema bancário usando Java

package com.andre.kotlin_overview;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}

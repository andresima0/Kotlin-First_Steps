// Exemplo simples de sistema bancário usando Kotlin
package com.andre.kotlin_overwiew

// Definindo a classe ContaBancaria
class ContaBancaria(var saldo: Double) {

    // Método para realizar saque
    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            println("Saque de R$$valor realizado. Novo saldo: R$$saldo")
        } else {
            println("Saldo insuficiente para realizar o saque de R$$valor")
        }
    }

    // Método para realizar depósito
    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito de R$$valor realizado. Novo saldo: R$$saldo")
        } else {
            println("O valor do depósito deve ser maior que zero.")
        }
    }

    // Método para verificar o saldo
    fun verificarSaldo() {
        println("Saldo atual: R$$saldo")
    }
}

// Código principal
fun main() {
    // Criando uma conta bancária com saldo inicial de R$1000.0
    val minhaConta = ContaBancaria(1000.0)

    // Realizando algumas operações
    minhaConta.verificarSaldo()
    minhaConta.depositar(500.0)
    minhaConta.sacar(200.0)
    minhaConta.verificarSaldo()
    minhaConta.sacar(1500.0) // Tentando sacar mais do que o saldo disponível

    // Criando outra conta bancária com saldo inicial de R$500.0
    val outraConta = ContaBancaria(500.0)

    // Realizando algumas operações na segunda conta
    outraConta.verificarSaldo()
    outraConta.sacar(100.0)
    outraConta.depositar(300.0)
    outraConta.verificarSaldo()
}

package com.andre.kotlin_overwiew_2

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Livro(
    val nome: String,
    val autor: String,
    val editora: String,
    var disponivel: Boolean = true,
    var dataRetirada: LocalDate? = null,
    var dataDevolucao: LocalDate? = null,
    var pessoaComLivro: String? = null
)

class Biblioteca {

    val acervo: MutableList<Livro> = mutableListOf()

    fun adicionarLivro(livro: Livro) {
        acervo.add(livro)
    }

    fun emprestarLivro(livro: Livro, pessoa: String, dataRetirada: LocalDate) {
        if (livro.disponivel) {
            livro.disponivel = false
            livro.dataRetirada = dataRetirada
            livro.dataDevolucao = dataRetirada.plusDays(15)
            livro.pessoaComLivro = pessoa
            println("$pessoa pegou emprestado o livro '${livro.nome}' (${livro.autor}, ${livro.editora}).")
            println("Devolução até: ${livro.dataDevolucao?.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))}")
        } else {
            println("O livro '${livro.nome}' (${livro.autor}, ${livro.editora}) não está disponível no momento.")
        }
    }

    fun devolverLivro(livro: Livro, dataDevolucao: LocalDate) {
        if (!livro.disponivel) {
            livro.disponivel = true
            livro.dataDevolucao = dataDevolucao
            livro.pessoaComLivro = null
            println("Livro '${livro.nome}' (${livro.autor}, ${livro.editora}) devolvido com sucesso.")
        } else {
            println("Este livro já está disponível na biblioteca.")
        }
    }

    fun mostrarStatusLivro(livro: Livro) {
        if (livro.disponivel) {
            println("O livro '${livro.nome}' (${livro.autor}, ${livro.editora}) está disponível na biblioteca.")
        } else {
            println("O livro '${livro.nome}' (${livro.autor}, ${livro.editora}) está emprestado para ${livro.pessoaComLivro} " +
                    "desde ${livro.dataRetirada} e deve ser devolvido até ${livro.dataDevolucao}.")
        }
    }
}

fun main() {
    val livro1 = Livro("Kotlin in Action", "Dmitry Jemerov", "Manning Publications", true)
    val livro2 = Livro("Computer Networks", "Andrew S. Tanenbaum", "Pearson", true)
    val livro3 = Livro("Clean Code", "Robert C. Martin", "Prentice Hall", true)
    val livro4 = Livro("Androids", "Chet Haase", "No Starch Press", true)

    val biblioteca = Biblioteca()
    biblioteca.adicionarLivro(livro1)
    biblioteca.adicionarLivro(livro2)
    biblioteca.adicionarLivro(livro3)
    biblioteca.adicionarLivro(livro4)

    // Usuário 1
    biblioteca.mostrarStatusLivro(livro1)
    biblioteca.emprestarLivro(livro1, "Andre", LocalDate.now())
    biblioteca.mostrarStatusLivro(livro1)

    // Usuário 2
    println("----------------------------------------")
    biblioteca.mostrarStatusLivro(livro2)
    biblioteca.emprestarLivro(livro2, "Jose", LocalDate.now())
    biblioteca.mostrarStatusLivro(livro2)

    // Usuário 3
    println("----------------------------------------")
    biblioteca.mostrarStatusLivro(livro3)
    biblioteca.emprestarLivro(livro3, "Maria", LocalDate.now())
    biblioteca.mostrarStatusLivro(livro3)

    // Situação de livro indisponível
    println("----------------------------------------")
    biblioteca.mostrarStatusLivro(livro2)
    biblioteca.emprestarLivro(livro2, "Lucas", LocalDate.now())  // Tentativa de empréstimo de livro indisponível
    biblioteca.mostrarStatusLivro(livro2)

    // Devoluções
    println("----------------------------------------")
    biblioteca.devolverLivro(livro1, LocalDate.now().plusDays(7))
    biblioteca.mostrarStatusLivro(livro1)

    println("----------------------------------------")
    biblioteca.devolverLivro(livro2, LocalDate.now().plusDays(7))
    biblioteca.mostrarStatusLivro(livro2)

    println("----------------------------------------")
    biblioteca.devolverLivro(livro3, LocalDate.now().plusDays(7))
    biblioteca.mostrarStatusLivro(livro3)
}
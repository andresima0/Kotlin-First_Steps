# Biblioteca

## Programa em Kotlin que simula um sistema de biblioteca com a definição de classes e métodos. 

### Principais objetivos e funções do código:

### Classes Principais:

1. **Livro:**
A classe `Livro` representa um livro com atributos como nome, autor, editora, disponibilidade, data de retirada, data de devolução e a pessoa que está com o livro.

2. **Biblioteca:**
A classe `Biblioteca` contém uma lista de livros (`acervo`) e métodos para realizar operações como adicionar livro, emprestar livro, devolver livro e mostrar o status do livro.

### Principais Funções:

1. **adicionarLivro(livro: Livro):**
Adiciona um livro à coleção da biblioteca.

2. **emprestarLivro(livro: Livro, pessoa: String, dataRetirada: LocalDate):**
Simula a operação de empréstimo de um livro. Verifica se o livro está disponível, atualiza as informações do livro e imprime uma mensagem indicando a operação.

3. **devolverLivro(livro: Livro, dataDevolucao: LocalDate):**
Simula a operação de devolução de um livro. Verifica se o livro está emprestado, atualiza as informações do livro e imprime uma mensagem indicando a operação.

4. **mostrarStatusLivro(livro: Livro):**
Mostra o status de um livro, indicando se está disponível na biblioteca ou emprestado, junto com informações sobre a pessoa que o retirou, a data de retirada e a data de devolução prevista.

### Fluxo Principal (função main):

- Cria quatro instâncias de `Livro` representando diferentes títulos.
- Cria uma instância de `Biblioteca`.
- Adiciona os livros à biblioteca.
- Realiza operações de empréstimo e devolução simuladas para três usuários.
- Mostra o status dos livros após cada operação.
- Inclui uma situação onde um livro está indisponível para empréstimo.
- Mostra novamente o status dos livros.

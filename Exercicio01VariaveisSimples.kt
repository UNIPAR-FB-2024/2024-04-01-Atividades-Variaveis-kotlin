fun main() {
    // Criação de variáveis imutáveis
    val idade = 20
    val altura = 1.75
    val nome = "Carlos"
    val ehEstudante = true

    // Operações simples com variáveis mutáveis
    val outraIdade = 22
    var somaIdades = idade + outraIdade
    var alturaDobro = altura * 2
    var saudacao = "Olá, $nome!"

    // Exibição dos resultados
    println("Idade: $idade")
    println("Altura: $altura")
    println("Nome: $nome")
    println("É estudante? $ehEstudante")
    println("Soma das idades: $somaIdades")
    println("Altura dobrada: $alturaDobro")
    println(saudacao)
}

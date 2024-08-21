fun main() {
    // Criação de variáveis
    val nome = "Ana"
    val idade = 30
    val salarioMensal = 3500.00
    val mesesTrabalhados = 12
    val quantidadeProdutosComprados = 15
    val valorTotalCompras = 4500.00

    // Operações simples
    val salarioAnualBruto = salarioMensal * mesesTrabalhados
    val desconto = 2000.00
    val salarioAnualLiquido = salarioAnualBruto - desconto
    val mediaValorPorProduto = valorTotalCompras / quantidadeProdutosComprados
    val mensagem = "$nome tem um salário anual líquido de R$ $salarioAnualLiquido"

    // Exibição dos resultados
    println("Nome: $nome")
    println("Idade: $idade")
    println("Salário Mensal: R$ $salarioMensal")
    println("Meses Trabalhados: $mesesTrabalhados")
    println("Salário Anual Bruto: R$ $salarioAnualBruto")
    println("Salário Anual Líquido: R$ $salarioAnualLiquido")
    println("Quantidade de Produtos Comprados: $quantidadeProdutosComprados")
    println("Valor Total das Compras: R$ $valorTotalCompras")
    println("Média do Valor por Produto: R$ $mediaValorPorProduto")
    println(mensagem)
}

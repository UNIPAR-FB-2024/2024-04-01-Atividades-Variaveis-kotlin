import java.text.DecimalFormat

fun main() {
    // Criação de variáveis
    val produto = "Teclado Mecânico"
    val precoUnitario = 250.75
    val quantidade = 10
    val taxaImposto = 0.18
    val margemLucro = 0.25

    // Operações simples
    val valorTotalSemImpostos = precoUnitario * quantidade
    val valorImposto = valorTotalSemImpostos * taxaImposto
    val valorTotalComImpostos = valorTotalSemImpostos + valorImposto
    val precoVendaSugerido = valorTotalComImpostos * (1 + margemLucro)

    // Desafio Extra
    val formato = DecimalFormat("R$ #,##0.00")
    val valorTotalComImpostosFormatado = formato.format(valorTotalComImpostos)
    val precoVendaSugeridoFormatado = formato.format(precoVendaSugerido)
    val mensagem = """
        Produto: $produto
        Valor total com impostos: $valorTotalComImpostosFormatado
        Preço de venda sugerido: $precoVendaSugeridoFormatado
    """.trimIndent()

    // Exibição dos resultados
    println("Produto: $produto")
    println("Preço Unitário: R$ $precoUnitario")
    println("Quantidade Comprada: $quantidade")
    println("Valor Total Sem Impostos: R$ $valorTotalSemImpostos")
    println("Valor do Imposto: R$ $valorImposto")
    println("Valor Total Com Impostos: $valorTotalComImpostosFormatado")
    println("Preço de Venda Sugerido: $precoVendaSugeridoFormatado")
    println(mensagem)
}

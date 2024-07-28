package alugames.modelo

//open class Plano(val tipo: String) {}
//abstract class Plano(val tipo: String) {}
// sealed => protected
sealed class Plano(val tipo: String, var id: Int = 0) {
    open fun obterValor(aluguel: Aluguel): Double {
        return aluguel.jogo.preco * aluguel.periodo.emDias
    }
}
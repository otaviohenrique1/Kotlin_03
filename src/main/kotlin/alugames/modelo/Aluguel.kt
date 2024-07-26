package alugames.modelo

import org.example.alugames.modelo.Jogo
import org.example.br.com.alura.alugames.modelo.Gamer

data class Aluguel(
    val gamer: Gamer,
    val jogo: Jogo,
    val periodo: Periodo,
) {
    val valorDoAluguel = gamer.plano.obterValor(this)
    override fun toString(): String {
        return "Aluguel do ${jogo.titulo} por ${gamer.nome} pelo valor R$$valorDoAluguel"
    }
}

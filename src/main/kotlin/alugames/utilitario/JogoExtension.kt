package alugames.utilitario

import alugames.modelo.InfoJogoJson
import org.example.alugames.modelo.Jogo

fun InfoJogoJson.criaJogo(): Jogo {
    return Jogo(this.titulo, this.capa, this.preco, this.descricao)
}
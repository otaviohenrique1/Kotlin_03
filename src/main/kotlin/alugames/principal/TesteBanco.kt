package alugames.principal

import alugames.dados.Banco
import alugames.dados.JogosDAO
import org.example.alugames.modelo.Jogo

fun main() {
//    val conexao = Banco.obterConexao()
//    println(conexao)
    val jogo = Jogo("The Last of Us Part I", "https://cdn.cloudflare.steamstatic.com/steam/apps/1888930/header.jpg?t=1686864554", 5.99,"Uma aventura pós-apocalíptica de sobrevivência em um mundo infestado por zumbis e facções em conflito.")
    val jogoDao = JogosDAO()
//    jogoDao.adicionarJogo(jogo)

    val listaJogos: List<Jogo> = jogoDao.getJogos()
    println(listaJogos)
}
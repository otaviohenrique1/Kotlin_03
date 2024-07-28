package alugames.principal

import alugames.dados.Banco
import alugames.dados.GamersDAO
import alugames.dados.PlanosDAO
import org.example.br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer = Gamer("Monica", "monica@email.com", "15/03/1995", "moni")

    val manager = Banco.getEntityManager()
    val gamersDAO = GamersDAO(manager)
    val planoDAO = PlanosDAO(manager)
    gamer.plano = planoDAO.recuperarPeloId(3)

    gamersDAO.adicionar(gamer)

    val listaGamersBanco = gamersDAO.getLista()
    println(listaGamersBanco)

    manager.close()
}
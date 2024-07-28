package alugames.dados

import alugames.utilitario.toEntity
import alugames.utilitario.toModel
import jakarta.persistence.EntityManager
import org.example.alugames.modelo.Jogo

class JogosDAO(manager: EntityManager): DAO<Jogo, JogoEntity>(manager, JogoEntity::class.java) {
    override fun toEntity(objeto: Jogo): JogoEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: JogoEntity): Jogo {
        return entity.toModel()
    }

//    fun getJogos(): List<Jogo> {
//        val listaJogos = mutableListOf<Jogo>()
//        val conexao = Banco.obterConexao()
//        if (conexao != null) {
//            try {
//                val statement = conexao.createStatement()
//                val resultado = statement.executeQuery("SELECT * FROM jogos")
//                while (resultado.next()) {
//                    val id = resultado.getInt("id")
//                    val titulo = resultado.getString("titulo")
//                    val capa = resultado.getString("capa")
//                    val descricao = resultado.getString("descricao")
//                    val preco = resultado.getDouble("preco")
//
//                    val jogo = Jogo(titulo, capa, preco, descricao, id)
//                    listaJogos.add(jogo)
//                }
//                statement.close()
//            } finally {
//                conexao.close()
//            }
//        }
//        return listaJogos
//    }

//    fun adicionarJogo(jogo: Jogo) {
//        val conexao = Banco.obterConexao()
//        val insert = "INSERT INTO jogos (TITULO, CAPA, PRECO, DESCRICAO) VALUES (?, ?, ?, ?)"
//        if (conexao != null) {
//            try {
//                val statement = conexao.prepareStatement(insert)
//                statement.setString(1, jogo.titulo)
//                statement.setString(2, jogo.capa)
//                statement.setDouble(3, jogo.preco)
//                statement.setString(4, jogo.descricao)
//
//                statement.execute()
//                statement.close()
//            } finally {
//                conexao.close()
//            }
//        }
//    }
}
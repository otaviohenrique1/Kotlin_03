package alugames.dados

import alugames.utilitario.toEntity
import alugames.utilitario.toModel
import jakarta.persistence.EntityManager
import org.example.alugames.modelo.Jogo
import org.example.br.com.alura.alugames.modelo.Gamer

class GamersDAO(manager: EntityManager): DAO<Gamer, GamerEntity>(manager, GamerEntity::class.java) {

    override fun toEntity(objeto: Gamer): GamerEntity {
        return objeto.toEntity()
    }

    override fun toModel(entity: GamerEntity): Gamer {
        return entity.toModel().apply { plano = entity.plano.toModel() }
    }
}
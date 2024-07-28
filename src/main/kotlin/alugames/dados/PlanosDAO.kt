package alugames.dados

import alugames.modelo.Plano
import alugames.utilitario.toEntity
import alugames.utilitario.toModel
import jakarta.persistence.EntityManager

class PlanosDAO(manager: EntityManager): DAO<Plano, PlanoEntity>(manager, PlanoEntity::class.java) {
    override fun toEntity(objeto: Plano): PlanoEntity {
        return  objeto.toEntity()
    }

    override fun toModel(entity: PlanoEntity): Plano {
        return  entity.toModel()
    }
}
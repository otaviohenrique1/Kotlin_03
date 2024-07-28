package alugames.utilitario

import alugames.dados.PlanoAssinaturaEntity
import alugames.dados.PlanoAvulsoEntity
import alugames.dados.PlanoEntity
import alugames.modelo.Plano
import alugames.modelo.PlanoAssinatura
import alugames.modelo.PlanoAvulso

fun Plano.toEntity(): PlanoEntity {
    return if (this is PlanoAssinatura) {
        PlanoAssinaturaEntity(
            this.tipo,
            this.mensalidade,
            this.jogosIncluidos,
            this.percentualDescontoReputacao,
            this.id
        )
    } else {
        PlanoAvulsoEntity(
            this.tipo,
            this.id
        )
    }
}

fun PlanoEntity.toModel(): Plano {
    return  if (this is PlanoAssinaturaEntity) {
        PlanoAssinatura(
            this.tipo,
            this.mensalidade,
            this.jogosIncluidos,
            this.percentualDescontoReputacao,
            this.id
        )
    } else {
        PlanoAvulso(
            this.tipo,
            this.id
        )
    }
}

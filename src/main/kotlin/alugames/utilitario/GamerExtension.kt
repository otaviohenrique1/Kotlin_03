package alugames.utilitario

import alugames.dados.GamerEntity
import org.example.alugames.modelo.InfoGamerJson
import org.example.br.com.alura.alugames.modelo.Gamer

fun InfoGamerJson.criaGamer(): Gamer {
    return Gamer(
        this.nome,
        this.email,
        this.dataNascimento,
        this.usuario
    )
}

fun Gamer.toEntity(): GamerEntity {
    return GamerEntity(this.id, this.nome, this.email, this.dataNascimento, this.usuario, this.plano.toEntity())
}

fun GamerEntity.toModel(): Gamer {
    return Gamer(this.nome, this.email, this.dataNascimento!!, this.usuario!!, this.id)
}
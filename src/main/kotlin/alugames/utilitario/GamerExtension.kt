package alugames.utilitario

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
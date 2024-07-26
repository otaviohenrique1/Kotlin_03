package org.example.alugames.principal
import org.example.alugames.modelo.Jogo
import org.example.br.com.alura.alugames.modelo.Gamer
import org.example.br.com.alura.alugames.servico.ConsumoApi
import transformarEmIdade
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val leitura = Scanner(System.`in`)
//    val gamer = Gamer.criarGamer(leitura)
//    println("Cadastro concluído com sucesso. Dados do gamer:")
//    println(gamer)
//    println("Idade do gamer: " + gamer.dataNascimento?.transformarEmIdade())

//    do {
//        println("Digite um código de jogo para buscar:")
//        val busca = leitura.nextLine()
//
//        val buscaApi = ConsumoApi()
//        val informacaoJogo = buscaApi.buscaJogosJson(busca)
//
//        var meuJogo: Jogo? = null
//
//        val resultado = runCatching {
//            meuJogo = Jogo(
//                titulo =  informacaoJogo.info.title,
//                capa = informacaoJogo.info.thumb
//            )
//        }
//        resultado.onFailure {
//            println("Jogo inexistente. Tente outro id.")
//        }
//        resultado.onSuccess {
//            println("Deseja inserir uma descrição personalizada? S/N")
//            val opcao = leitura.nextLine()
//            if (opcao.equals("s", true)) {
//                println("Insira a descrição personalizada para o jogo:")
//                val descricaoPersonalizada = leitura.nextLine()
//                meuJogo?.descricao = descricaoPersonalizada
//            } else {
//                meuJogo?.descricao = meuJogo?.titulo
//            }
//            // println(meuJogo)
//            gamer.jogosBuscados.add(meuJogo)
//        }
//        println("Deseja buscar um novo jogo?S/N")
//        val resposta = leitura.nextLine()
//    } while (resposta.equals("s", true))
//
//    print("Jogos buscados:")
//    println(gamer.jogosBuscados)
//
//    println("\n Jogos ordenados por título:")
//    gamer.jogosBuscados.sortBy {
//        it?.titulo
//    }
//
//    gamer.jogosBuscados.forEach {
//        println("Título: " + it?.titulo)
//    }
//
//    val jogosFiltrados = gamer.jogosBuscados.filter {
//        it?.titulo?.contains("batman", true)  ?: false
//    }
//    println("Jogos filtrados")
//    println(jogosFiltrados)
//
//    println("Deseja excluir algum jogo da lista original? S/N")
//    val opcao = leitura.nextLine()
//    if (opcao.equals("s", true)) {
//        println(gamer.jogosBuscados)
//        println("\n Informe a posição do jogo que deseja excluir: ")
//        val posicao = leitura.nextInt()
//        gamer.jogosBuscados.removeAt(posicao)
//    }
//
//    println("Busca finalizada com sucesso.")
}

/*
package org.example
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val leitura = Scanner(System.`in`)
    println("Digite um código de jogo para buscar:")
    val busca = leitura.nextLine()

    val endereco = "https://www.cheapshark.com/api/1.0/games?id=$busca"
//    val endereco = "https://www.cheapshark.com/api/1.0/games?id=146"

    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create(endereco))
        .build()
    val response = client.send(request, BodyHandlers.ofString())
    val json =  response.body()
//    println(json)

    val gson = Gson()
    val meuInfoJogo = gson.fromJson(json, InfoJogo::class.java)

//    try {
//        val meuJogo = Jogo(
//            titulo =  meuInfoJogo.info.title,
//            capa = meuInfoJogo.info.thumb
//        )
//        println(meuJogo)
//    } catch (ex: NullPointerException) {
//        println("Jogo inexistente. Tente outro id.")
//    }

    var meuJogo: Jogo? = null

    val resultado = runCatching {
        meuJogo = Jogo(
            titulo =  meuInfoJogo.info.title,
            capa = meuInfoJogo.info.thumb
        )
//        println(meuJogo)
    }
    resultado.onFailure {
        println("Jogo inexistente. Tente outro id.")
    }
    resultado.onSuccess {
        println("Deseja inserir uma descrição personalizada? S/N")
        val opcao = leitura.nextLine()
        if (opcao.equals("s", true)) {
            println("Insira a descrição personalizada para o jogo:")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        } else {
            meuJogo?.descricao = meuJogo?.titulo
        }
        println(meuJogo)
    }
}
*/
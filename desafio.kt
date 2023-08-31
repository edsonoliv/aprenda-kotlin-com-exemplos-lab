// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)
import kotlin.collections.MutableList

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val nivel: Nivel, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("Usuário ${usuario.nome} matriculado na formação $nome")
        } else {
            println("Usuário ${usuario.nome} já está matriculado na formação $nome")
        }
    }

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
        println("Conteúdo '${conteudo.nome}' adicionado à formação $nome")
    }

    fun listarConteudos() {
        println("Conteúdos da formação $nome:")
        for (conteudo in conteudos) {
            println("${conteudo.nome} - Duração: ${conteudo.duracao} minutos")
        }
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 45)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 60)

    val formacaoKotlin = Formacao("Formação Kotlin", Nivel.INTERMEDIARIO)

    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario1) // Tentativa de matricular usuário já matriculado

    formacaoKotlin.adicionarConteudo(conteudo1)
    formacaoKotlin.adicionarConteudo(conteudo2)

    formacaoKotlin.listarConteudos()
}
// Arquivo: Formacao.kt
data class Formacao(val nome: String, val nivel: String, val conteudosEducacionais: List<ConteudoEducacional>) {
    val alunosMatriculados: MutableList<Aluno> = mutableListOf()

    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
        println("Aluno ${aluno.nome} matriculado na formação $nome")
    }
}

// Arquivo: ConteudoEducacional.kt
data class ConteudoEducacional(val titulo: String, val descricao: String)

// Arquivo: Aluno.kt
data class Aluno(val nome: String)

// Arquivo: Desafio.kt
fun main() {
    val formacaoKotlin = Formacao(
        nome = "Formação Kotlin",
        nivel = "Intermediário",
        conteudosEducacionais = listOf(
            ConteudoEducacional("Introdução ao Kotlin", "Aprenda os conceitos básicos do Kotlin"),
            ConteudoEducacional("Programação Orientada a Objetos em Kotlin", "Aprofunde seus conhecimentos em OOP com Kotlin")
            // Adicione mais conteúdos educacionais conforme necessário
        )
    )

    val aluno1 = Aluno("João")
    val aluno2 = Aluno("Maria")

    formacaoKotlin.matricularAluno(aluno1)
    formacaoKotlin.matricularAluno(aluno2)
}

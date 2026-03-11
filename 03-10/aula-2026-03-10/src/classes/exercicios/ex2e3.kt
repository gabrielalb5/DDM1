package classes.exercicios
//EXERCÍCIO 2
//Crie uma classe `Livro` que represente um livro em uma biblioteca.
//Essa classe deve ter as seguintes propriedades:
//- titulo (imutável)
//- autor (imutável)
//- anoPublicacao (imutável)
//- estaEmprestado: indica se o livro está emprestado (mutável)
//- descricao: uma propriedade somente de leitura (com custom getter) que retorna uma string
//formatada com as informações do livro.
//Os valores da propriedade `descricao` devem seguir o seguinte padrão:
//"Dom Casmurro (1899), de Machado de Assis. Disponível para empréstimo."
//"Dom Casmurro (1899), de Machado de Assis. Atualmente emprestado."

class Livro(
    val titulo:String,
    val autor:String,
    val anoPublicacao:Int,
    var estaEmprestado:Boolean
){
    fun statusEmprestimo(): String {
        return if (estaEmprestado) "Atualmente emprestado." else "Disponível para empréstimo."
    }
    val descricao: String
        get() {
            return "$titulo ($anoPublicacao), de $autor. ${statusEmprestimo()} "
        }
    fun emprestar() {
        estaEmprestado = true
    }
    fun devolver() {
        estaEmprestado = false
    }
}

fun main() {
    val l1 = Livro("Dom Casmurro","Machado de Assis", 1899, true)
    val l2 = Livro("Dom Casmurro","Machado de Assis", 1899, false)
    println(l1.descricao)
    println(l2.descricao)

    l1.devolver()
    l2.emprestar()
    println(l1.descricao)
    println(l2.descricao)
}


//EXERCÍCIO 3
//Na classe `Livro`, do exercício anterior, crie dois métodos públicos:
//`emprestar()` e
//`devolver()`.
//Esses métodos devem marcar o livro como emprestado e devolvido, respectivamente.

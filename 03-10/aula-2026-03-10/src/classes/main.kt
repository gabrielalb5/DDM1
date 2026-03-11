package classes

class Pessoa(
    val nome:String,
    var estudante:Boolean
){
    fun dizer(){
        println("Meu nome é $nome.")
        val papel = if (estudante) "sou" else "não sou"
        println("Eu $papel estudante.   ")
    }
}

fun main() {
    val p = Pessoa("Maria", true)
    println("Nome: "+ p.nome)
    println("Estudante: "+p.estudante)
    p.estudante = false
    println("Estudante: "+p.estudante)
    //p.nome = "Mariazinha" //Val cannot be reassigned (final)
    p.dizer()
}
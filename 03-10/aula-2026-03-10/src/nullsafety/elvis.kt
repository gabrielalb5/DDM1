package nullsafety

fun main(){
    // Inferência para o tipo "Nothing?"
    val endereco = null // "Rua Dois"
    val rua = endereco ?: "desconhecido"
    println(rua)
}
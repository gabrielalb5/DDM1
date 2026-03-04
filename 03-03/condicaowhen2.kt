fun main() {
    val idade = 17

    when{
        idade < 13 -> println("criança")
        idade < 18 -> println("adolescente")
        else -> println("adulto")
    }
}
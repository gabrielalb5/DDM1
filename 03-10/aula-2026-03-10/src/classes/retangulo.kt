package classes

class Retangulo(
    val largura:Int,
    val altura:Int
){
    val isSquare: Boolean
        get() {
            return largura == altura
        }
}

fun main() {
    val r1 = Retangulo(10,20)
    val r2 = Retangulo(10,10)

    println("Quadrado: " +r1.isSquare)
    println("Quadrado: " +r2.isSquare)
}
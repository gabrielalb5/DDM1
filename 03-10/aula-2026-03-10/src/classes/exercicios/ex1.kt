package classes.exercicios
//EXERCÍCIO 1 - Defina uma propriedade chamada `area` para a classe `Rectangle`. A propriedade `area` deve ser somente leitura.

class Rectangle(
    val largura:Double,
    val altura:Double
){
    val area: Double
        get() {
            return largura * altura
        }
}

fun main() {
    val r1 = Rectangle(10.0,20.0)
    val r2 = Rectangle(10.0,10.0)

    println("Área: " +r1.area)
    println("Área: " +r2.area)

    //r1.area = 100 //Val cannot be reassigned
}
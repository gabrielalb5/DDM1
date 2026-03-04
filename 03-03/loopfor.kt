fun main() {
    val frutas = listOf("laranja","banana","maçã")

    for(fruta in frutas){
        println(fruta)
    }

    // for controlado por ínidices
    for(i in 1 .. 10){
        println(i)
    }

    val max = 10

    for(i in 1..max) println(i)

    //range
    val x = 5
    if(x in 1..10){
        println("Está no intervalo!")
    }
}
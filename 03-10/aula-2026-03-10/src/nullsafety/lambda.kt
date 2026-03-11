package nullsafety

fun executar(x:Int, y:Int, op:(Int, Int)->Int): Int{
    return op(x,y)
}

fun main() {
    val somar: (Int, Int) -> Int = {x:Int,y:Int -> x+y}
    val mult = {x:Int,y:Int -> x*y}

    val res = executar(5,3,somar)
    val res2 = executar(5,3,mult)
    println(res)
    println(res2)

    val res3 = executar(5,3) {a, b -> a - b}
    //val res3 = executar(5,3, {a, b -> a - b})
    //Como o lambda é o último parâmetro da fun executar, é possível declará-lo externamente.
    println(res3)
}
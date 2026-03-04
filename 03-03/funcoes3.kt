fun printRes(res:Int){
    println("Res: $res")
}
// Tipo Unit indica que não haverá valor de retorno. É como o void, de Java
// O Unit pode omitido na declaração da função

fun useless(x:Int){ // tipo Unit omitido
    println(x)
}

fun main(){
    val x = 2+3
    printRes(x)
}
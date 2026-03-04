fun maior(a:Int, b:Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maior2(a:Int, b:Int) =
    if(a>b){
        a
    }else{
        b
    }

fun maior3(a:Int, b:Int) = if(a>b) a else b

fun main(){
    val res = maior(2,10)
    println("Maior: $res")

    val res2 = maior2(20,10)
    println("Maior 2: $res2")

    val res3 = maior2(2,1)
    println("Maior 3: $res3")

    val x = 17
    val paridade = if(x%2==0) "par" else "impar"

    println("Paridade de $x - $paridade")
}
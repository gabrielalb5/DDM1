fun main() {
    // um while tradicional
    var j = 0
    while(j<=10){
        println(j)
        j = j + 2
    }

    // faz o mesmo que o while anterior
    for(i in 0 .. 10 step 2){
        println(i)
    }
}
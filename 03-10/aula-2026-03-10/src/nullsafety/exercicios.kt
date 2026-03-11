package nullsafety /* Exercício 1. Declare uma função `transformar()` que receba dois parâmetros:
  - Uma string s; e
  - Uma expressão lambda, op.
A função deve retornar uma versão da string s alterada pelo lambda op.
Experimente chamar a função passando um lambda que retorne a string convertida para letras maiúsculas `str.uppercase()`.
Repita o procedimento passando um lambda que retorne o primeiro caracter da string. Para retornar o primeiro caracter de uma string s, use a expressão s[0].*/

/*Versão Exercício 1 ---------------------------------
fun transformar(s:String, op:(String)->String):String{
    return op(s);
}*/

fun transformar(s:String?, op:(String)->String):String{
    return op(s ?: "x");
}

fun main() {
    val palavraMaiuscula = {s:String -> s.uppercase()}
    val primeiraLetra = {s:String -> s[0].toString()?: "x"}
    println(transformar("kotlin",palavraMaiuscula))
    println(transformar("kotlin",primeiraLetra))
    println(transformar(null,primeiraLetra)) // Exercício 2
    println(transformar("kotlin3", { s:String -> s.uppercase()})) // Exercício 3
    println( transformar("kotlin3") {s:String -> s.uppercase()} ) // Exercício 3
}

/*Exercício 2. Modifique a função `transformar()` para que o parâmetro s possa assumir o valor null.
  Use esta nova versão da função para executar um lambda que retorne o primeiro caracter da string s.
 Caso o valor de s seja null, retorne “x” no lugar do primeiro caracter*/

 /*Exercício 3. Experimente chamar a função `transformar()`, do Exercício 1, de duas maneiras:
 - Passando a expressão lambda entre parênteses;
 - Passando a expressão lambda fora dos parênteses*/

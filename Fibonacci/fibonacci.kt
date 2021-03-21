fun main() {
    val n = readLine()!!.toInt()
    fibonacci_n(n)

}

fun fibonacci_n(n: Int) {
    var i = n
    var f1 = 0
    var f2 = 1
    var S = f2
    println("Sequência de Fibonacci ")
    print("$f1, $f2")
    while (i > 2) {
        val next = f2
        f2 = f1 + f2
        f1 = next
        i -= 1
        print(", $f2")
        S += f2
    }
    if (i <= 2){
        println("\nÚltimo número: $f2")
        println("Número de séries: $n")
        println("Soma da série: $S")
    }
}

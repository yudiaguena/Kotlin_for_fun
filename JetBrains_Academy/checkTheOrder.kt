fun main() {
    val N = readLine()!!.toInt()
    var previous = Int.MIN_VALUE
    var length = 0
    var maxLength = 1
    for (i in 1..N) {
        val x = readLine()!!.toInt()
        if (x >= previous) {
            previous = x
            length = length + 1
            if (length > maxLength) {
                maxLength = length
            } 
        } else {
            previous = x
            length = 1
        }
    }
    println("$maxLength")
}
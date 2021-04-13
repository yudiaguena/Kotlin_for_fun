// time and date from readline
fun main() {
    val time = readLine()?.split(" ")?.joinToString(":")
    val date = readLine()?.split(" ")?.joinToString("/")
    
    println("$time $date")
}
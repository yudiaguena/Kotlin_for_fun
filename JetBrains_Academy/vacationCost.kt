//vacation cost
fun main(vararg args: String) {
    val duration = readLine()!!.toInt()
    val food = readLine()!!.toInt()
    val flight = readLine()!!.toInt()
    val hotel = readLine()!!.toInt()
    val cost = duration * food + flight * 2 + (duration - 1) * hotel
    print("$cost")
}
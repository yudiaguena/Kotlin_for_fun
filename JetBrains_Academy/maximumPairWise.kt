fun main() {
    val n = readLine()!!.toInt()
    val arr = ArrayList<Int>()
    if (n > 1) {
        for (i in 1..n) {
            arr.add(i - 1, readLine()!!.toInt())
        }
        arr.sortDescending()
        print(arr[0] * arr[1])
    } else { print(readLine()!!.toInt()) }
}
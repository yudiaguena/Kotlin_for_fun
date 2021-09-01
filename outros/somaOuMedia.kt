fun main(args: Array<String>) {
    
    val C = readLine()!!.toInt()
    var sum = 0.0
    var med = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12)}
    
    for (i in M.indices) {
        for (j in M.indices) {
            M[i][j] = readLine()!!.toDouble()
        }
    }
    for (k in 0.until(M.size)) {
        sum += M[k][C]
    }
    for (n in 0.until(M.size)) {
        med = sum/M.size
    }
    if (T == "S") {
        println(sum.format(1))
    }
    if (T == "M"){
        println(med.format(1))
    }
}

private fun Double.format(digits: Int) = "%.${digits}f"
    .format(this).replace(',','.')
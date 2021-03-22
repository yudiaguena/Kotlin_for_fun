fun main() {
    var firstAnswer: Boolean = readLine()!!.toBoolean()
    var secondAnswer: Boolean = readLine()!!.toBoolean()
    var confession: Boolean = readLine()!!.toBoolean()
    
    if (firstAnswer && secondAnswer && !confession) {
        print("true")
    } else if (firstAnswer && !secondAnswer && !confession) {
        print("false")
    } else if (!firstAnswer && !secondAnswer && confession) {
        print("false")
    } else {
        print("true")
    }

}
// Failed test #5 of 6. Wrong answer, have yet to be fixed.

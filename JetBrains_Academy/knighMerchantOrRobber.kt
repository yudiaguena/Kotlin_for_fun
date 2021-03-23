fun main() {
    var firstAnswer: Boolean = readLine().toBoolean()
    var secondAnswer: Boolean = readLine().toBoolean()
    var confession: Boolean = readLine().toBoolean()
    
    println(!(firstAnswer xor secondAnswer) and !confession)

}
// Failed test #5 of 6. Wrong answer, have yet to be fixed.

/*Sir Backsword met two men on the road who asked to be his companions. They said that both of them have the same profession. He decided to find out who they are: knights, merchants, or robbers.

Write a program that will help him decide if he can trust the strangers. You already have three booleans: firstAnswer, secondAnswer, and confession.

firstAnswer and secondAnswer are the answers of the strangers themselves about their profession. We assume that no one will ever say that robbery is a profession, so true means knight and false means merchant.
confession will be true only if they confessed in good faith that they are robbers.
The strangers can't be trusted if their answers don't match or if they confessed that they are robbers. In this case, print false, otherwise, print true.
Sample Input 1:

true
true
false
Sample Output 1:

true
Sample Input 2:

true
false
false
Sample Output 2:

false
Sample Input 3:

false
false
true
Sample Output 3:

false

Hint

You can use XOR to check that the answers are different.*/
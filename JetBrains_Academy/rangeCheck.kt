// can use to check

//char range
println('b' in 'a'..'c') // true
println('k' in 'a'..'e') // false

println("hello" in "he".."hi") // true
println("abc" in "aab".."aac") // false

// range chips
val a = 10
val b = 12
val range = a..b - 1
// 10~11

val range = 100..200
println(300 in range) // false
fun main() {
printNumbers()
}
fun printNumbers () {
    for (i in 1..100) {
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 5 == 0 -> {
                println("Buzz")
            }
            i % 3 == 0 -> {
                println("Fizz")
            }
            else -> {
                println(i)
            }
        }
    }
}
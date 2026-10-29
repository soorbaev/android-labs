fun main() {
    print("Enter an integer n: ")
    val n = readln().toInt()

    val label = when {
        n < 0 -> "negative"
        n == 0 -> "zero"
        n % 2 == 0 -> "positive even"
        else -> "positive odd"
    }

    println(label)
}
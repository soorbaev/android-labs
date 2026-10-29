fun main() {
    val small: Byte = 100
    val medium: Short = 20_000

    val sum = small + medium

    println("Sum: $sum (Result type promoted to Int)")

}
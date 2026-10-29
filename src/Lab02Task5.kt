fun main() {
    print("Enter Celsius: ")
    val c = readln().toDouble()

    val f = c * 9.0 / 5.0 + 32.0

    println("C = $c")
    println("F = $f")

    val isBelowFreezing = f < 32.0
    println("Is below freezing: $isBelowFreezing")
}
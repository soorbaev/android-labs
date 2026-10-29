fun main() {
    print("Enter first number: ")
    val a = readln().toInt()

    print("Enter second number: ")
    val b = readln().toInt()

    print("Enter third number: ")
    val c = readln().toInt()

    val (small, med, large) = when {
        a <= b && b <= c -> Triple(a, b, c)
        a <= c && c <= b -> Triple(a, c, b)
        b <= a && a <= c -> Triple(b, a, c)
        b <= c && c <= a -> Triple(b, c, a)
        c <= a && a <= b -> Triple(c, a, b)
        else -> Triple(c, b, a)
    }

    println("$small $med $large")
}
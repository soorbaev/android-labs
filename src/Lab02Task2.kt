fun main() {
    print("Enter a: ")
    val a = readln().toInt()
    print("Enter b: ")
    val b = readln().toInt()

    val quotient = a / b
    val remainder = a % b
    val exact = a.toDouble() / b

    println("quotient = $quotient")
    println("remainder = $remainder")
    println("exact = $exact")
}
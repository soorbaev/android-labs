fun main() {
    print("Enter first integer: ")
    val a = readln().toInt()

    print("Enter second integer: ")
    val b = readln().toInt()

    val max = if (a > b) a else b

    println("max = $max")
}
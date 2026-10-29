fun main() {
    print("Enter a digit: ")
    val line = readln()
    val ch = line[0]

    val value = ch - '0'

    println("value = $value")
    println("value * 2 = ${value * 2}")
}
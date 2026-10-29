fun main() {
    print("Enter char: ")
    val line = readln()
    val ch = line[0]

    val category = when (ch) {
        in '0'..'9' -> "Digit"
        in 'A'..'Z' -> "Uppercase"
        in 'a'..'z' -> "Lowercase"
        else -> "Other"
    }

    println(category)
}
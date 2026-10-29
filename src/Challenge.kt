fun main() {
    print("Enter a character to shift: ")
    val line = readln()
    val ch = line[0]

    val shiftedChar = if (ch in 'a'..'z') {
        'a' + (ch - 'a' + 1) % 26
    } else {
        ch
    }

    println("Result: $shiftedChar")
}
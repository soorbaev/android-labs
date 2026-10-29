fun main() {
    print("Enter a character: ")
    val line = readln()
    val ch = line[0]

    println("isDigit: ${ch.isDigit()}")
    println("isLetter: ${ch.isLetter()}")
    println("isWhitespace: ${ch.isWhitespace()}")
    println("lowercaseChar: ${ch.lowercaseChar()}")
    println("uppercaseChar: ${ch.uppercaseChar()}")
}
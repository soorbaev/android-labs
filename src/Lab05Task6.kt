fun main() {
    print("Enter text: ")
    val text = readln()

    var result = ""
    for (ch in text) {
        if (ch.isLetter()) {
            result += ch
        }
    }

    println("Result: $result")
}
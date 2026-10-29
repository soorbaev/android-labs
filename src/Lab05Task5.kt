fun main() {
    print("Enter text: ")
    val text = readln()

    var count = 0
    for (ch in text) {
        if (ch.isLetter()) {
            count++
        }
    }

    println("Letters: $count")
}
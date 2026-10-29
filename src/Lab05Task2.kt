fun main() {
    print("Enter a line: ")
    val line = readln()

    if (line.isEmpty()) {
        println("Empty input")
    } else {
        val first = line[0]
        val last = line[line.length - 1]
        println("first = $first")
        println("last = $last")
    }
}
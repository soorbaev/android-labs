fun main() {
    print("Enter names (comma-separated): ")
    val input = readln()

    val names = input.split(",")

    for (i in names.indices) {
        val trimmedName = names[i].trim()
        println("$i: $trimmedName")
    }
}
fun main() {
    print("Enter score (0-100): ")
    val score = readln().toInt()

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }

    println("Grade: $grade")
}
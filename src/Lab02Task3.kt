fun main() {
    print("Enter total seconds: ")
    val totalSeconds = readln().toInt()

    val hours = totalSeconds / 3600
    val remainingSecondsAfterHours = totalSeconds % 3600
    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    println("H:M:S -> $hours:$minutes:$seconds")
}
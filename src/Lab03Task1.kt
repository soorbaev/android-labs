fun main() {
    print("Enter score: ")
    val score = readln().toInt()

    if (score >= 50) {
        println("Pass")
    } else {
        println("Fail")
    }
}
fun main() {
    print("Enter temperature: ")
    val temp = readln().toInt()

    if (temp < 0) {
        println("Freezing")
    } else if (temp <= 14) {
        println("Cold")
    } else if (temp <= 24) {
        println("Mild")
    } else {
        println("Warm")
    }
}
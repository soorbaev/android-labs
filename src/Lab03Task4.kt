fun main() {
    print("Enter age: ")
    val age = readln().toInt()

    if (age < 13 || age > 65) {
        println("Discount")
    } else {
        println("Regular")
    }
}
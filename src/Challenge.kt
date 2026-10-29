fun main() {
    print("Enter price: ")
    val price = readln().toDouble()

    print("Enter quantity: ")
    val quantity = readln().toInt()

    var total = price * quantity
    total *= 0.9
    println("Total with 10% discount: $total")
}
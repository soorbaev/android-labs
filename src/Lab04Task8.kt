fun main() {
    var choice: String

    do {
        println("1) Hello  2) Quit")
        print("Choice: ")
        choice = readln()

        if (choice == "1") {
            println("Hello!")
        } else if (choice != "2") {
            println("Unknown")
        }
    } while (choice != "2")
}
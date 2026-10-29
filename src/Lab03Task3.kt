fun main() {
    print("Enter age: ")
    val age = readln().toInt()

    print("Do you have a ticket? (yes/no): ")
    val ticketInput = readln().lowercase()
    val hasTicket = ticketInput == "yes"

    if (age >= 12 && hasTicket) {
        println("Enter")
    } else if (age < 12) {
        println("Too young")
    } else {
        println("Need a ticket")
    }
}
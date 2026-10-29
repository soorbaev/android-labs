fun main() {
    val basePopulation: Long = 8_100_000_000L

    print("Enter extra people: ")
    val extra = readln().toInt()

    val totalPopulation = basePopulation + extra.toLong()

    println("Base: $basePopulation")
    println("Extra: $extra")
    println("Total: $totalPopulation")
}
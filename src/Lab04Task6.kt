fun main() {
    // 1..5
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // downTo
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    // until
    for (i in 0 until 3) {
        print("$i ")
    }
    println()

    // step
    for (i in 1..9 step 2) {
        print("$i ")
    }
    println()
}
// Task 7.3.1: list element access
fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    // Prints all numbers in list
    println(numbers)
    // Prints 9
    println(numbers[0])
    // Prints 6, 2, 8
    println(numbers.slice(2..4))
    // Prints 9
    println(numbers.first())
    // Prints 5
    println(numbers.last())
}
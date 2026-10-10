// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
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
    // Adds the number 10 to the list
    numbers.add(10)
    println(numbers)
    // Removes 10 from the list
    numbers.remove(10)
    println(numbers)
    // Removes 9 from the list
    numbers.removeAt(0)
    println(numbers)
    // Clears the list
    numbers.clear()
    println(numbers)
}
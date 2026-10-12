// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val string = "Szeth-son-son-Vallano, Truthless of Shinovar, wore white on the day he was to kill a king."
    println(string)
    println("HowMany:")

    println("Number of even length words: ${string.howMany {it.length % 2 == 0}}")
    println("Number of odd length words: ${string.howMany {it.length % 2 != 0}}")
    println("Number of words with length less than 5: ${string.howMany {it.length < 5}}")
    println("Number of words with length greater than 5: ${string.howMany {it.length > 5}}")

    println("count:")
    println("Number of even length words: ${string.count {it.length % 2 == 0}}")
    println("Number of odd length words: ${string.count {it.length % 2 != 0}}")
    println("Number of words with length less than 5: ${string.count {it.length < 5}}")
    println("Number of words with length greater than 5: ${string.count {it.length > 5}}")


}

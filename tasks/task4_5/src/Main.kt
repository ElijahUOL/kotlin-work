// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    var sum: Long = 0
    val upperLimit = args[0].toInt()
    for (n in 1..upperLimit)
    {
        sum += n
    }
    println("$sum")
}

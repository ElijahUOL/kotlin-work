// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here

    val result = runCatching {
        val data = readData(args[0])
        val variance = variance(data)
        println("Number of items in dataset: ${data.size}, variance of data: $variance")
    }
    if (result.isFailure) {
        println("Task failed with an exception:")
        println(result.exceptionOrNull())
        exitProcess(1)
    }
    exitProcess(0)
}

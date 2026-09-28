// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>)
{
    // Checks if two arguments are present
    if (args.size != 2)
    {
        println("Error: 2 arguments required")
        exitProcess(1)
    }
    // Prints the two arguments to the console
    println(args[0])
    println(args[1])
}

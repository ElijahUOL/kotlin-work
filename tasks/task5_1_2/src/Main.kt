// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main (args: Array<String>)
{
    if (args.size == 0)
    {
        println("No arguments provided!")
        exitProcess(1)
    }
    else
    {
        rollDie(args[0].toInt())
    }
}
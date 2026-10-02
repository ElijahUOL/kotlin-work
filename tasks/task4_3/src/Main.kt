// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main (args: Array<String>)
{
    if (args.size != 3)
    {
        println("Error: wrong number of grades given")
        exitProcess(1)
    }
    val averageMark = ((args[0].toDouble() + args[1].toDouble() + args[2].toDouble()) / 3).roundToInt()
    val grade = when(averageMark)
    {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "Invalid grade"
    }
    println("You achieved an average mark of $averageMark and a grade of $grade")
}

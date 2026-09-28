// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle
// Name: Elijah Luehrmann
// Student Number: 201942447

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main (args: Array<String>)
{
    // Checks if 3 arguments are provied and exits code if not
    if (args.size < 3)
    {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    //Assigns arguments to variables and calulcates s to be ued in formula from Wikipedia link provided
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()
    val s = (0.5*(a+b+c))

    // Uses 3 arguments and the s value caluclated to calculate the triangle's area and prints it to the console to 5 decimal points
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    println("Area = %.5f".format(area))
}
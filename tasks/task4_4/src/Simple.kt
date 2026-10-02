// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    val initialTemp = args[0].toDouble()
    val finalTemp = args[1].toDouble()
    val incriment = args[2].toDouble()
    var workingTemp = initialTemp
    System.out.printf("%7s %12s%n", "Celsius", "Fahrenheit")
    while (workingTemp <= finalTemp) {
        val tempInFahrenheit = workingTemp * 1.8 + 32
        System.out.printf("%7.1f %12.1f%n", workingTemp, tempInFahrenheit)
        workingTemp += incriment
    }
}

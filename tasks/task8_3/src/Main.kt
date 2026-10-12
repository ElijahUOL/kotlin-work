// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val weatherData = fetchData(args[0])
    val lowestTemp = weatherData.minBy {it.second}
    val highestTemp = weatherData.maxBy {it.second}
    println("The highest temperature was recorded at ${highestTemp.first} and was ${highestTemp.second} degrees")
    println("The lowest temperature was recorded at ${lowestTemp.first} and was ${lowestTemp.second} degrees")
    val averageTemp = weatherData.sumOf { it.second } / weatherData.size
    println("The average temperature was %.2f".format(averageTemp))
}

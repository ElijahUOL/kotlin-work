// Task 7.7.1: statistics functions
fun findMedian (numbers: List<Float>): Float {
    if (numbers.size % 2 == 0 ) {
        val median: Float =  numbers[numbers.size / 2]
        return median
    }
    else {
        val median: Float =  numbers[(numbers.size + 1) / 2]
        return median
    }
}

fun displayStats(numbers: List<Float>) {
    println("The minimum value is ${numbers.min()}")
    println("The maximum value is ${numbers.max()}")
    println("The sum of all values is ${numbers.sum()}")
    println("The average value is %.1f".format(numbers.average()))
    println("The median value is ${findMedian(numbers)}")
}
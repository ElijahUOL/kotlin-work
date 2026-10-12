// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry
// Name: Elijah Luehrmann
// Student Number: 201942447

// Will use code from portfolio week two to calculate triangle area and check if a triangle is valid

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    // Checks if each line is shorter than the sum of the other two and
    // returns true if that is the case for all sides, otherwise returns false
    if (triangle.first < triangle.second + triangle.third){
        if (triangle.second < triangle.first + triangle.third) {
            if (triangle.third < triangle.first + triangle.second) {
                return true
            }
        }
    }
    return false
}

fun triangleArea(triangle: Triangle): Double {
    // Throws an exception if the triangle is not valid before attempting to calculate the area
    require(isValidTriangle(triangle))

    // Assigns input to variables and calculates s to be used in formula from Wikipedia link provided
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    val s = (0.5*(a+b+c))

    // Uses 3 arguments and the s value calculated to calculate the triangle's area and prints it to the console to 5 decimal points
    val area = sqrt(s*(s-a)*(s-b)*(s-c))

    return area
}

// COMP2850 Portfolio: Week 4
// Triangle class
// Name: Elijah Luehrmann
// Student Number: 201942447

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    init {
        // Requires triangle to be a valid triangle when initialising otherwise throws an error
        require((sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB)) {"Error: Invalid triangle given"}
    }
    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = perimeter / 2
    val area: Double get() {
        // Assigns input to variables and calculates s to be used in formula from Wikipedia link provided
        val a = sideA
        val b = sideB
        val c = sideC
        val s = (0.5*(a+b+c))

        // Uses 3 arguments and the s value calculated to calculate the triangle's area and prints it to the console to 5 decimal points
        val area = sqrt(s*(s-a)*(s-b)*(s-c))

        return area
    }

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}
// Task 12.4.1: Circle class
import kotlin.math.PI
import kotlin.math.hypot


class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0.0) {"Error: radius must be > 0"}
    }
    fun area() = PI * radius * radius
    fun perimeter() = PI * radius * 2
    infix fun contains(p: Point) = (this.radius >= p.distanceTo(this.centre))
}
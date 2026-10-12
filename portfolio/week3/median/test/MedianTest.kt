// COMP2850 Portfolio: Week 3
// Tests for median()
// Name: Elijah Luehrmann
// Student ID: 201942447

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    // Write four more tests here
    "Returns an equal value when size = 1" {
        median(listOf(1.0f)) shouldBe (1.0f plusOrMinus tolerance)
    }
    "Returns the average of the first and second value when size = 2" {
        median(listOf(1.0f, 2.0f)) shouldBe (1.5f plusOrMinus tolerance)
    }
    "Returns the second value when size = 3" {
        median(listOf(1.0f, 2.0f, 3.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }
    "Returns the average of the second and third value when size = 4" {
        median(listOf(1.0f, 2.0f, 3.0f, 4.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }
})

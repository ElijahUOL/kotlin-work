// Task 13.4: Money class
data class Money (val euros: Int, val cents: Int) {
    init {
        require (euros >= 0) {"Cannot have negative euros value"}
        require (cents >= 0 && cents <= 99) {"Cannot have negative cents value"}
    }
    operator fun plus(other: Money) {
        if (cents + other.sents > 99){
            return Money(euros + other.euros + 1, cents + other.cents - 100)
        }
        return Money(euros + other.euros, cents + other.cents)


    }
}
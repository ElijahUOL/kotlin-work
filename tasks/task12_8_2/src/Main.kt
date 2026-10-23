// Task 12.8.2: program to manipulate playing cards
import Card.Rank
import Card.Suit

fun main() {
    val deck = buildList{
        for (suit in Suit.entries) {
            for (rank in Rank.entries) {
                add(Card(rank, suit))
            }
        }
    }
    val shuffledDeck = deck.shuffled()
    for (card in shuffledDeck) {
        println(card.fullName)
    }
}
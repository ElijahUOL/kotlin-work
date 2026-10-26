// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val account = SavingsAccount("elijah", 0, 1.8)
    account.deposit(1250)
    for (i in 1..5) {
        account.applyInterest()
    }
    account.withdraw(50)
    println("Balance: £${account.balance}")

}

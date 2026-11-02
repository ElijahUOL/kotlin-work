// Name: Elijah Luehrmann
// Student Number: 201942447

package comp2850.banking

val MAX_OVERDRAFT = 100
class StudentAccount(holder: String, _overdraft: Int = 0): BankAccount(holder) {

    var overdraft = _overdraft
        set(overdraft) {
            require (overdraft >= 0 && overdraft <= 100) {"Overdraft must be between 0 and 100"}
            field = overdraft
        }

    override fun withdraw(amount: Int){
        require (amount > 0) {"Withdrawal amount must be greater than 0"}
        require (balance - amount >= overdraft * -1) {"Insufficient funds for withdrawal"}
        balance -= amount
    }
    fun withdrawalsAllowed(): Boolean {
        if (balance > -overdraft) {
            return true
        }
        return false
    }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}

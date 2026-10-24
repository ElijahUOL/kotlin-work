// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count {it.status == ItemStatus.NotStarted}  // compute no. of items with NotStarted status
    val inProgress get() = items.count {it.status == ItemStatus.InProgress}     // compute no. of items with InProgress status
    val done get() = items.count {it.status == ItemStatus.Done}         // compute no. of items with Done status
    val overdue get() = items.count {it.isOverdue()}       // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        val filepath = Path(filename)
        filepath.forEachLine {
            val splitLine = it.split(": ")
            val dates = splitLine[0].split("-")
            val date = LocalDate(dates[0].toInt(), dates[1].toInt(), dates[2].toInt())
            val statusText = splitLine[1]
            var status = ItemStatus.NotStarted
            if (splitLine[1] == "Done") {
                status = ItemStatus.Done
            }
            else if (splitLine[1] == "NotStarted") {
                status = ItemStatus.NotStarted
            }
            else if (splitLine[1] == "InProgress") {
                status = ItemStatus.InProgress
            }
            items.add(ToDoItem(date, status, splitLine[2]))
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        val originalSize = items.size
        items.removeAll() {it.status == ItemStatus.Done}
        val newSize = items.size
        if (originalSize == newSize) {
            return false
        }
        return true
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        val gotItems = mutableListOf<ToDoItem>()
        if (status == null){
            return items
        }
        for (item in items) {
            if (item.status == status){
                gotItems.add(item)
            }
        }
        return gotItems
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        val gotItems = mutableListOf<ToDoItem>()
        for (item in items) {
            if (item.dueDate == date) {
                gotItems.add(item)
            }
        }
        return gotItems
    }
}

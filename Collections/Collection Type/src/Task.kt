data class Person(val name: String, val age: Int)

fun buildList(vararg persons: Person): MutableList<Person> {
    return persons.toMutableList()
}

fun freezeList(vararg persons: Person): List<Person> {
    return persons.asList()
}

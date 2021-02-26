data class Person(val name: String, val age: Int)

fun oneYearOlder(person: Person): Person {
    return person.copy(age = person.age + 1)
}

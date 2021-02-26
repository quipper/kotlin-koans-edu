import org.junit.Assert.assertEquals
import org.junit.Test

class Test {

    @Test
    fun testSolution() {
        val person = Person("Quippo", 10)
        val olderPerson = oneYearOlder(person)

        assertEquals(person.name, olderPerson.name)
        assertEquals(11, olderPerson.age)
    }
}

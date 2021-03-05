import org.junit.Assert.assertEquals
import org.junit.Test

class Test {

    @Test
    fun testSolution() {
        val person1 = Person("Cloud", 13)
        val person2 = Person("Squall", 17)

        val immutableList = freezeList(person1, person2)
        val mutableList = buildList(person1, person2)

        assertEquals(person1, immutableList[0])
        assertEquals(person2, immutableList[1])

        assertEquals(person1, mutableList[0])
        assertEquals(person2, mutableList[1])
    }
}

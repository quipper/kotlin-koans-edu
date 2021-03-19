import koans.util.checkCodeContains
import org.junit.Assert
import org.junit.Test

class Test {

    @Test fun testElvisOperator() {
        val path = System.getProperty("user.dir")
        println(path)
        Assert.assertTrue("Use the Elvis Operator", checkCodeContains("?:"))
    }

    @Test fun testElvisOperatorNonNull() {
        Assert.assertTrue("Fix the Elvis Operator", strLen("try strLen") == 10)
    }

    @Test fun testElvisOperatorNull() {
        val nullStr : String? = null
        Assert.assertTrue("Fix the Elvis Operator", strLen(nullStr) == -1)
    }
}

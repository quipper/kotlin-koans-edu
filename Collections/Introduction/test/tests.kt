import org.junit.Assert
import org.junit.Test
import koans.util.errorMessage
import org.junit.Assert.assertEquals

class TestIntroduction {
    @Test(timeout = 1000)
    fun testEmptyCustomers() {
        Assert.assertTrue(emptyCustomerList().isEmpty())
    }

    @Test(timeout = 1000)
    fun testListOfCustomers() {
        val customer1 = shop.customers[0]
        val customer2 = shop.customers[1]
        val customerList = createCustomerList(customer1, customer2)
        assertEquals(customer1, customerList[0])
        assertEquals(customer2, customerList[1])
    }

    @Test(timeout = 1000)
    fun testSetOfCustomers() {
        Assert.assertTrue(errorMessage("getSetOfCustomers"),
                shop.getSetOfCustomers() == customers.values.toSet())
    }
}

import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testHigherOrderSum() {
        //TODO: implement your test here
        Assert.assertTrue("Declare higher order function parameter: operation", higherOrderSum(4, 5) == 9)
    }

    @Test fun testHigherOrderMultiplication() {
        //TODO: implement your test here
        Assert.assertTrue("Declare an inline higher order function to multiply", higherOrderMultiplyInline(4, 5) == 20)
    }
}

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class ArithmeticOperationsTest {
    @Test
    fun sum() {
        val integers = listOf(1, 2, 3, 4, 5, 6, 7, 9, 10)
        val operator = ArithmeticOperations()
        Assertions.assertEquals(47, operator.sum(integers))
    }

    @Test
    fun primes() {
        val integers = listOf(1,2,3,4,5,6,7,8,9,10,11)
        val expectedPrimes = listOf(2,3,5,7,11)
        val operator = ArithmeticOperations()
        val actualPrimes = operator.filterPrimes(integers)
        Assertions.assertEquals(expectedPrimes, actualPrimes)
    }
}
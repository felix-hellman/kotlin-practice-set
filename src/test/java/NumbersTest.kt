import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@Suppress("CanBeVal")
class NumbersTest {
    @Test
    fun assignInteger() {
        var a = 0
        val b = 42
        // Add your solution here
        // End
        Assertions.assertEquals(a, b)
    }

    @Test
    fun sum() {
        val integers = listOf(930, 102, 2320, 1321, 10102, 102191, 1211, 13912, 1231, 128318, 110010, 48183, 2109392, 12019, 1203123, 12301231)
        var sum = 0
        //Add your solution here
        //End
        Assertions.assertEquals(16045596, sum)
    }
}
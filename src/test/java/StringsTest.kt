import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@Suppress("CanBeVal")
class StringsTest {
    //Lowercase the String capital
    @Test
    fun lowercase() {
        var capital = "CAPITALISM"
        // Add your solution here
        //End
        Assertions.assertEquals("capitalism", capital)
    }

    // Reverse the String reverseMe
    @Test
    fun reverse() {
        var reverseMe = "CAPITALISM"
        //Add your solution here
        //End
        Assertions.assertEquals("MSILATIPAC", reverseMe)
    }

    // Remove every odd indexed character e.g. "Hello" -> "Hlo"
    @Test
    fun noOddOnes() {
        var oddString = "IadbLcidkeefTgoh"
        //Add your solution here
        //End
        Assertions.assertEquals("IdLikeTo", oddString)
    }
}
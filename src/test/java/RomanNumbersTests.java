import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class RomanNumbersTests {

    @Test
    public void convertToRomanValidInputReturnsCorrectRoman(){
        int inputNum = 100;
        String expected = "C";
        String actual = Main.GenerateRomanNumber(inputNum);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToRomanInvalidInput(){
        String inputStr = "one";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.GenerateRomanNumber(Integer.parseInt(inputStr));
        });
    }
    @Test
    public void convertToRomanEmptyString() {
        String inputStr = "";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.GenerateRomanNumber(Integer.parseInt(inputStr));
        });
    }
    @Test
    public void convertToRomanNonNumericInput() {
        String inputStr = "123abc";
        assertThrows(IllegalArgumentException.class, () -> {
            Main.GenerateRomanNumber(Integer.parseInt(inputStr));
        });
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulationTest {
    StringManipulation stringManipulation;



    @Test
    public void testForEmptyStringShouldReturnEmptyString() throws Exception {
        stringManipulation = new StringManipulation("");
        assertEquals("", stringManipulation.manipulateWithMommy());
    }

    @Test
    public void testForSingleConsonantShouldReturnSameConsonant() throws Exception {
        stringManipulation = new StringManipulation("h");
        assertEquals("h",stringManipulation.manipulateWithMommy());

    }

    @Test
    public void testForSingleVowelShouldReturnMommy() throws Exception {
        stringManipulation = new StringManipulation("a");
        assertEquals("mommy",stringManipulation.manipulateWithMommy());
    }

    @Test
    public void testForMoreConsonantStringShouldReturnNoMommy() throws Exception {
        stringManipulation = new StringManipulation("hard");
        assertEquals("hard",stringManipulation.manipulateWithMommy());

    }

    @Test
    public void testForMoreThan30PercentVowelsShouldInsertMommy() throws Exception {
        stringManipulation = new StringManipulation("his");
        assertEquals("hmommys",stringManipulation.manipulateWithMommy());
    }

    @Test
    public void testForContinuousVowelsShouldInsertOneMommy() throws Exception {
        stringManipulation = new StringManipulation("head");
        assertEquals("hmommyd",stringManipulation.manipulateWithMommy());

    }
}

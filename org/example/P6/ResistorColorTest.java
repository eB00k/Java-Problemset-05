
import ResistorColor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResistorColorTest {

    private ResistorColor resistorColor;

    @Before
    public void setUp() {
        resistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        String input = "black";
        int expected = 0;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testWhiteColorCode() {
        String input = "white";
        int expected = 9;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testOrangeColorCode() {
        String input = "orange";
        int expected = 3;

        assertEquals(expected, resistorColor.colorCode(input));
    }

    //@Ignore("Remove to run test")
    @Test
    public void testColors() {
        String[] expected = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        Assert.assertArrayEquals(expected, resistorColor.colors());
    }

    // add more test: todo
}
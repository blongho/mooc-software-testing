package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private static GHappy happy;

    @BeforeEach
    public void init() {
        happy = new GHappy();
    }

    @Test
    public void emptyStringIsUnHappy() {
        Assertions.assertFalse(happy.gHappy(""));
    }

    @Test
    public void twoConsecutiveGsIsHappy() {
        Assertions.assertTrue(happy.gHappy("xxggxx"));
    }

    @Test
    public void oneGsIsHappy() {
        Assertions.assertFalse(happy.gHappy("xxgxx"));
    }

    @Test
    public void oneHappyAndOneSadgIsNotHappy() {
        Assertions.assertFalse(happy.gHappy("xxggyygxx"));
    }
}

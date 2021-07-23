package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public  void testLongString(){
        Mirror mirror = new Mirror();
        Assertions.assertEquals("ab", mirror.mirrorEnds("abXYZba"));
        Assertions.assertEquals("a", mirror.mirrorEnds("abca"));
        Assertions.assertEquals("aba", mirror.mirrorEnds("aba"));
    }
}

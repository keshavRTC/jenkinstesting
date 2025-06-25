package jenkinsTest_simple;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class HelloTest {

    @Test
    public void sampleTest() {
        assertTrue(10 > 2, "10 should be greater than 2");
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    public void stringTest(){
        java.lang.String expected = "Hello World";
        java.lang.String actual ="Hello World";
        assertEquals(expected, actual);
    }
}

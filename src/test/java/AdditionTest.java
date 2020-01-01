import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void sum() {
        assertEquals(2,Addition.sum(1,1));
    }
}
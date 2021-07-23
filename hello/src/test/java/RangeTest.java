import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeTest {
    @Test
    @DisplayName("input [1,5] start with [ (include) result is true")
    public  void startWithInclude(){
        Range myRange = new Range("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("input (1,5] start with ( (exclude) result is false")
    public  void startWithExclude(){
        Range myRange = new Range("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("input (1,5] start with ( (exclude) result is false")
    public  void startWithNumber(){
        Range myRangeex = new Range("(1,5]");
        int resultex = myRangeex.getStart();
        assertEquals(2,resultex);

        Range myRangein = new Range("[1,5]");
        int resultin = myRangein.getStart();
        assertEquals(1,resultin);
    }
}

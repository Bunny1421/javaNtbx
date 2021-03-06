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
    @DisplayName("test start input number ")
    public  void startWithNumber(){
        Range myRangeex = new Range("(1,5]");
        int resultex = myRangeex.getStart();
        assertEquals(2,resultex);

        Range myRangein = new Range("[1,5]");
        int resultin = myRangein.getStart();
        assertEquals(1,resultin);
    }

    @Test
    @DisplayName("input [1,5] end with ] (include) result is true")
    public  void endWithInclude(){
        Range myRange = new Range("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("input [1,5) end with ) (exclude) result is false")
    public  void endWithExclude(){
        Range myRange = new Range("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("test end input number ")
    public  void endWithNumber(){
        Range myRangeEndEx = new Range("[1,5]");
        int resultEndEx = myRangeEndEx.getEnd();
        assertEquals(5,resultEndEx);

        Range myRangeEndIn = new Range("[1,5)");
        int resultEndIn = myRangeEndIn.getEnd();
        assertEquals(4,resultEndIn);
    }

    @Test
    @DisplayName("test result")
    public  void result(){
        Range myRangeEndEx = new Range("[1,5]");
        String resultAllIn = myRangeEndEx.getResult();
        assertEquals("12345",resultAllIn);
    }
}

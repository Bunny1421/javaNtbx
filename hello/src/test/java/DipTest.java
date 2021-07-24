import dip.Dip;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;





class RandomX extends Random {
    long number;
    public RandomX(long seed) {
        number = seed;
    }

    @Override
    public int nextInt(int bound) {
        return (int) number;
    }
}
public class DipTest {


    @Test
    @DisplayName("ต้องได้ id=XYZ7")
    public void case01() {
        Dip service = new Dip();
        service.setRandom(new RandomX(7)); // Test Double = Stub
        String id = service.getId();
        assertEquals("XYZ7", id);
    }
}

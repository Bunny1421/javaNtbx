import dip.Dip;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DipTest {
    @Test
    @DisplayName("ต้องได้ id=XYZ7")
    public void case01() {
        Dip service = new Dip();
        String id = service.getId();
        assertEquals("XYZ7", id);
    }
}

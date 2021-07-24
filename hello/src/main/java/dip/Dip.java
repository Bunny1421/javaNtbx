package dip;
import java.util.Random;

public class Dip {
    private Random random;

    public String getId() {
        int number = random.nextInt(10);
        return  "XYZ" + number;
    }
    public void setRandom(Random random) {
        this.random = random;
    }
}

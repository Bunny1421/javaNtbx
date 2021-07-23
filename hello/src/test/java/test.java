import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class test {
    @Test
    public  void sayHelloTest(){
        Hello hello = new Hello();
        String name = "Nuchy";
        String actualResult = hello.sayHello(name);
        assertEquals("Hello Nuchy", actualResult);
    }
}

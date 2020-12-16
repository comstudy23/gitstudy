package sig.oss;

import static org.junit.Assert.*;
import org.junit.*;

public class CalcTest {
    @Test
    public void testAdd() {
        System.out.println(">>>>>>>>>> Run testAdd() method .....");
        Calc c = new Calc();
        assertEquals(30, c.add(10, 20));
    }

    @Test
    public void testSub() {
        System.out.println(">>>>>>>>>> Run testSub() method .....");
        Calc c = new Calc();
        assertEquals(-10, c.sub(10, 20));
    }

    @Test
    public void testMultipleInc() {
        Calc c = new Calc();
        c.inc(25);
        c.inc(25);
        assertEquals(50, c.getResult());
    }
}
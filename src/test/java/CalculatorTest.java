import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator main = new Calculator();

    @Test
    void testAdd1() {
        assertEquals(2, main.add(1, 1));
    }
    @Test
    void testAdd2() {
        assertEquals(1, main.add(2, -1));
    }
    @Test
    void testAdd3() {
        assertEquals(1, main.add(-1, 2));
    }
    @Test
    void testAdd4() {
        assertEquals(-2, main.add(-1, -1));
    }
    @Test
    void testDif1() {
        assertEquals(0, main.dif(1, 1));
    }
    @Test
    void testDif2() {
        assertEquals(-3, main.dif(2, -1));
    }
    @Test
    void testDif3() {
        assertEquals(3, main.dif(-1, 2));
    }
    @Test
    void testDif4() {
        assertEquals(0, main.dif(-1, -1));
    }
    @Test
    void testDiv1() {
        assertEquals(1, main.div(1, 1));
    }
    @Test
    void testDiv2() {
        assertEquals(-2, main.div(2, -1));
    }
    @Test
    void testDiv3() {
        assertEquals(0, main.div(-1, 2));
    }
    @Test
    void testDiv4() {
        assertEquals(1, main.div(-1, -1));
    }
    @Test
    void testDiv5() {
        assertEquals(Integer.MIN_VALUE, main.div(1, 0));
    }
    @Test
    void testDiv6() {
        assertEquals(0, main.div(0, 1));
    }
    @Test
    void testDiv7() {
        assertEquals(0, main.div(-1, 20));
    }
    @Test
    void testTimes1() {
        assertEquals(1, main.times(1, 1));
    }
    @Test
    void testTimes2() {
        assertEquals(-2, main.times(2, -1));
    }
    @Test
    void testTimes3() {
        assertEquals(-2, main.times(-1, 2));
    }
    @Test
    void testTimes4() {
        assertEquals(1, main.times(-1, -1));
    }
    @Test
    void testTimes5() {
        assertEquals(0, main.times(0, 10));
    }
    @Test
    void solver1() {
        assertEquals(-200, main.solver(3, 1, 100));
    }
    @Test
    void solver2() {
        assertEquals(-100, main.solver(7, 3, 50));
    }
    @Test
    void solver3() {
        assertEquals(1050, main.solver(11, 15, 200));
    }
    @Test
    void solver4() {
        assertEquals(2000, main.solver(60, 90, 500));
    }
}
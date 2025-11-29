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
    void testSolver1() {
        assertEquals(5000, main.solver(1, 100));
    }
    @Test
    void testSolver2() {
        assertEquals(4400, main.solver(-1, 100));
    }
    @Test
    void testSolver3() {
        assertEquals(-5000, main.solver(-1, -100));
    }
    @Test
    void testSolver4() {
        assertEquals(-4400, main.solver(1, -100));
    }
}
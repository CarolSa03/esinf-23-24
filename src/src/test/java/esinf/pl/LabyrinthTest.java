package esinf.pl;

import org.junit.Test;

import static esinf.pl.Labyrinth.check;
import static org.junit.Assert.*;

/**
 *
 * @author Carolina Sa
 */
public class LabyrinthTest {

    public LabyrinthTest() {
    }

    /**
     * Test of check method, of class Labirinth.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        int[][] actual = {
                {1,1,1,0,1,1,0,0,0,1,1,1,1},
                {1,0,1,1,1,0,1,1,1,1,1,0,1},
                {1,0,0,0,1,0,1,0,1,0,1,0,1},
                {1,0,0,0,1,1,1,0,1,0,1,1,1},
                {1,1,1,1,1,0,0,0,0,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,1}
        };
        int y = 0;
        int x = 0;
        int[][] expResult = {
                {9,9,9,0,2,2,0,0,0,2,2,2,2},
                {1,0,9,9,9,0,2,2,2,2,2,0,2},
                {1,0,0,0,9,0,2,0,2,0,2,0,2},
                {1,0,0,0,9,2,2,0,2,0,2,2,2},
                {1,1,1,1,9,0,0,0,0,1,0,0,0},
                {0,0,0,0,9,0,0,0,0,0,0,0,0},
                {0,0,0,0,9,9,9,9,9,9,9,9,9}
        };
        int[][] result = check(actual, y, x);
        assertArrayEquals(expResult, result);

        int [] [] impossibleActual = {
                {1,1,1,0,1,1,0,0,0,1,1,1,1},
                {1,0,1,1,1,0,1,1,1,1,1,0,1},
                {1,0,0,0,1,0,1,0,1,0,1,0,1},
                {1,0,0,0,1,1,1,0,1,0,1,1,1},
                {1,1,1,1,1,0,0,0,0,1,0,0,0},
                {0,0,0,0,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1}
        };
        expResult = null;
        result = check(impossibleActual, y, x);
        assertArrayEquals(expResult, result);

    }
}
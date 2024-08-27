package esinf.pl;

/**
 *
 * @author Carolina Sa
 */
public class Labyrinth {
    /**
     *
     * @param actual the labyrinth in its actual (marked) form
     * @param y coordinate y in the labyrinth
     * @param x coordinate x in the labyrinth
     * @return the marked labyrinth or null if there is no way
     */
    public static int [][] check(int [][] actual, int y, int x) {

        //checking if current position is the beginning, or out of bounds.
        if (x < 0 || y < 0 || x >= actual.length || y >= actual[0].length || actual[x][y] != 1) {
            return null;
        }

        //if it reaches the destination, mark it as 9
        if(x== actual.length-1 && y==actual[0].length-1){
            actual[x][y] = 9;
            return actual;
        }

        //marking the current position as 9 since it went through first case, and it is potential path
        actual[x][y] = 9;

        //moving in all directions

        //north
        if (check(actual, y, x-1) != null) {
            return actual;
        }

        //east
        if (check(actual, y+1, x) != null) {
            return actual;
        }

        //south
        if (check(actual, y, x+1) != null) {
            return actual;
        }

        //west
        if (check(actual, y-1, x) != null) {
            return actual;
        }

        //if no direction works, but it went through, we mark it as 2
        actual[x][y] = 2;
        return null;
    }
}

package esinf.pl;

/**
 *
 * @author Carolina Sa
 */

public class Recursive {
    /**
     * @param s string to be reversed
     * @return reversed string
     */
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    /**
     * @param m first integer
     * @param n second integer
     * @return the product between the two numbers
     */

    public static int product(int m, int n){
        if(n == 0) return 0;
        else if(n<0) return -product(m, -n);
        else return m + product(m, n-1);
    }

    /**
     * @param m first integer
     * @param n second integer
     * @return the greatest common divisor between both numbers
     */

    public static int gcd(int m, int n){
        int x = 0;
        if(m<n) {
            x = n;
            n = m;
            m = x;
        }
        if(n==0) return m;
        if(m%n == 0) return n;
        return gcd(m%n, n);
    }

    /**
     * @param s string to be converted into int
     * @return the greatest common divisor between both numbers
     */

    public static int stringToInt(String s){
        if(s.isEmpty()) return 0;
        else {
            int first = s.charAt(0) - '0';
            return first * (int) Math.pow(10, s.length() -1) + stringToInt(s.substring(1));
        }
    }

    /**
     * @param m the integer number
     * @return checks if a number is palindrome
     */

    public static boolean isPalindrome(int m){
        String s = String.valueOf(m);
        if(s.length() == 1) return true;
        else{
            if(s.charAt(0) != s.charAt(s.length()-1)) return false;
            else return isPalindrome(stringToInt(s.substring(1, s.length()-1)));
        }
    }

    /**
     * @param list given array list
     * @param row row of the array
     * @param col column of the array
     * @return sum of elements in the row
     */

    public static int sumRow(int[][] list, int row, int col){
        if(col == list[row].length){
            return 0;
        }
        return list[row][col] + sumRow(list, row, col+1);
    }

    /**
     * @param list given array list
     * @param row row of the array
     * @return sum of elements in total using sumRow method
     */

    public static int sumOfElemArray(int[][] list, int row){
        if(row == list.length) return 0;
        return sumRow(list, row, 0) + sumOfElemArray(list, row+1);
    }

}

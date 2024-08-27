package esinf.tp;

public class Recursion {
    /**
     *
     * @param m first parcel
     * @param n second parcel
     * @return the sum of the two parcels
     */
    public static int sum(int m, int n) {

        if(n==0) return m;
        return sum(m+1,n-1);
    }

    /**
     *
     * @param d number in decimal base
     * @return the number converted to binary base
     */
    public static String decimalToBinary(Integer d) {
        if(d==0) return "0";
        if(d==1) return "1";
        return decimalToBinary(d/2) + d%2;
    }

    /**
     *
     * @param d number to check
     * @return true if the number is a prime, false otherwise
     */
    public static boolean isPrime(int d) {
        if(d<2) return false;
        return isPrime(d,2);
    }

    private static boolean isPrime(int d, int i) {
        if(i * i > d) return true;
        if(d % i == 0) return false;
        return isPrime(d,i+1);
    }

    /**
     *
     * @param word word to check
     * @return true if the word is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String word) {
        if(word.length()<=1) return true;
        if(word.charAt(0)!=word.charAt(word.length()-1)) return false;
        return isPalindrome(word.substring(1,word.length()-1));
    }
}

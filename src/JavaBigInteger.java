import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Documentación:
https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
 */

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        BigInteger a = stdin.nextBigInteger();
        BigInteger b = stdin.nextBigInteger();
        BigInteger sum = a.add(b);
        BigInteger mult = a.multiply(b);
        System.out.println(sum + "\n" + mult);
    }
}
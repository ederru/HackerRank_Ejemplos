import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
Documentación:
https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html
 */

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");

    }
}
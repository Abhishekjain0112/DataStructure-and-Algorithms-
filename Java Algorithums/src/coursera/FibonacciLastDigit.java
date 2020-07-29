/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;
         BigInteger p= new BigInteger("0");
         BigInteger c= new BigInteger("1");
        long previous = 0;
        long current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            BigInteger tmp = new BigInteger(p.toString());
            previous = current;
            p = c;
            current = tmp_previous + current;
            c=p.add(c);
        }
        ///System.out.println(": "+p.toString());
        return current % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

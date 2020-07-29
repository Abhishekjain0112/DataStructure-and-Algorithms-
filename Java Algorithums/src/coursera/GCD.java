/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

/**
 *
 * @author Abhishek
 */
import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {

      if (b==0)
       return a;
       a = a%b;
      int c= gcd_naive(b, a);
      return c;
      
   

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
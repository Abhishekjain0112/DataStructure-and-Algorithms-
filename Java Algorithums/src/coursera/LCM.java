/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

import java.math.BigInteger;
import java.util.*;

public class LCM {
	
  private static String lcm_naive(int a, int b) {
      long gcd = gcd_naive(a, b);
     // System.out.println("GCD :" + gcd);
         //   System.out.println("multi :" + a*b);
          BigInteger aa = new BigInteger(""+a);
          BigInteger bb = new BigInteger(""+b);
          BigInteger mul=aa.multiply(bb);
         // System.out.println("print big multiplay :"+714552 374513 mul);
          BigInteger lcm = mul.divide(new BigInteger(""+gcd));
         // System.out.println("lcm =" +lcm);
     // return ((a)/gcd)*((b)/gcd);
            long m =a*b;
           // System.out.println("multi :" + m);
             return lcm.toString();
                     
  }

    private static long gcd_naive(int a, int b) {

      if (b==0)
       return a;
       a = a%b;
      long c= gcd_naive(b, a);
      return c;
      
   

  }
  
  
  
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}

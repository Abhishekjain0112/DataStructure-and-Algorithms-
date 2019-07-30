/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;


import java.util.*;

class test{


public static void main(String args[]){

  Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();

  int sum=(num%10)*10;
   num/=10;
    sum =sum+(num%10);
  
System.out.print(sum);
}


}


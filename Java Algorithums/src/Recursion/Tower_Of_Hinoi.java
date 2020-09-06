/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Tower_Of_Hinoi {

static int count=0;    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enterr the Number of Disks:");
        int n =sc.nextInt();
        TOH(1, 2, 3, n);
        System.out.println("Total Number of Moves: "+count);
        
    }
 
    static void TOH(int source,int helper,int destination,int n){
      count++;
      if(n==1){
         System.out.println("Move "+source + "-->" + destination +" :Helper="+helper);
        return;
      }
//if(n>0)
    {
      TOH(source,destination,helper,n-1);
      System.out.println("Move "+source + "-->" + destination +" :Helper="+helper);
       TOH(helper, source, destination, n-1);
    }
    }
    
}
/*

Enterr the Number of Disks:
5
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 3-->1 :Helper=2
Move 2-->1 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 3-->2 :Helper=1
Move 3-->1 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Total Number of Moves: 31









Enterr the Number of Disks:
5
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 3-->1 :Helper=2
Move 2-->1 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 3-->2 :Helper=1
Move 3-->1 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Move 1-->2 :Helper=3
Move 3-->2 :Helper=1
Move 1-->3 :Helper=2
Move 2-->1 :Helper=3
Move 2-->3 :Helper=1
Move 1-->3 :Helper=2
Total Number of Moves: 63




*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class Acyclicity {
    static boolean hascycle=false;
    
    public static int[] m(){
     return new int[]{1,5};
    }
    
    private static int acyclic(ArrayList<Integer>[] adj) {
        //write your code here
        
        
        
        boolean visited[]=new boolean[adj.length];
        boolean stack[]=new boolean[adj.length];
        for(int i=0; i<adj.length;i++){
           if(!visited[i])
           {
         cycle(adj, i, visited,stack); 
           }
           if(hascycle)
               return 1;
        }   
        return 0;
    }
   public static void cycle(ArrayList<Integer>[] adj ,int x,boolean[] visited,boolean[] stack) {
       visited[x]=true;
       stack[x]=true;
       
      for(int xx:adj[x]){
         if(!visited[xx])
       cycle(adj, xx, visited,stack);        
         else{
          if(stack[xx])
            {
              hascycle=true;
              return;
            }
         }
         } 
     stack[x]=false;
   }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            adj[x - 1].add(y - 1);
        }
        System.out.println(acyclic(adj));
    }
}

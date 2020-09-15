/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abhishek
 */

public class ConnectedComponents {
    private static int numberOfComponents(ArrayList<Integer>[] adj) {
        int result = 0;
        //write your code here
        boolean visited[]=new boolean[adj.length];
        for(int i=0;i<adj.length;i++){
             if(!visited[i])
             {
              result++;
                 explore(adj, i, visited);
             }    
        }
        
        return result;
    }
    
    
     static void explore(ArrayList<Integer>[] adj,int x,boolean[] visited){
     
         if(visited[x])
             return;
         visited[x]=true;
         for(int xx:adj[x]){
             if(!visited[xx])
                 explore(adj, xx, visited);
         }
     
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
            adj[y - 1].add(x - 1);
        }
        System.out.println(numberOfComponents(adj));
    }
}



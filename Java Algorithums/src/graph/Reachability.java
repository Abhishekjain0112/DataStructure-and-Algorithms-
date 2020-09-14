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

public class Reachability {
    private static int reach(ArrayList<Integer>[] adj, int x, int y,boolean []visited) {
        //write your code here
         visited[x]=true;
        
         if(x==y || visited[y]==true)return 1;
         
	 for(int xx:adj[x]){
             if(!visited[xx])
                reach(adj, xx, y, visited);
         }
        if(visited[y]==true)return 1; 
        return 0;
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
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;
        boolean vesited[]=new boolean[n];
        
        System.out.println(reach(adj, x, y,vesited));
    }
}


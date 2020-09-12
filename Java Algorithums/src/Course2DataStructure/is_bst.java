/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course2DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Abhishek
 */

public class is_bst {
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public class IsBST {
        class Node {
            int key;
            int left;
            int right;

            Node(int key, int left, int right) {
                this.left = left;
                this.right = right;
                this.key = key;
            }
        }

        int nodes;
        Node[] tree;

        void read() throws IOException {
            FastScanner in = new FastScanner();
            nodes = in.nextInt();
            tree = new Node[nodes];
            for (int i = 0; i < nodes; i++) {
                tree[i] = new Node(in.nextInt(), in.nextInt(), in.nextInt());
            }
        }
         boolean solve() {
        	if (nodes == 0) return true;
          	return isBinarySearchTree(tree,0);
                
        }       
        
      boolean isBinarySearchTree(Node tree[],int index){
          // Implement correct algorithm here
            if(index==-1)
                return true;		
	  if(index>tree.length-1)
		return false;
            Node root= tree[index];
            
            if(root.left<tree.length && root.right<tree.length)
            if(isBinarySearchTree(tree, root.left) && isBinarySearchTree(tree, root.right)){
                
                if((root.left ==-1 && root.right ==-1)) 
                    return true;
                if(root.left==-1 && tree[root.right].key>root.key)
                    return true;
                if(root.right==-1 && tree[root.left].key<root.key)
                    return true;
                
                if((root.left !=-1 && root.right !=-1) && (tree[root.left].key<root.key &&tree[root.right].key>root.key)){
                   return true;      
                }
                
                return false;
                
                    
            }
            
            
          return false;
        }
    }

    static public void main(String[] args) throws IOException {
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    new is_bst().run();
                } catch (IOException e) {
                }
            }
        }, "1", 1 << 26).start();
    }
    public void run() throws IOException {
        IsBST tree = new IsBST();
        tree.read();
        if (tree.solve()) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }
    }
}


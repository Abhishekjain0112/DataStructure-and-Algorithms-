/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class AVL_Tree {
    Node root;
    class Node{
    int key;
    Node right,left;
    int hight;  
    Node(int key){
    this.key=key;
    hight=1;
    }
    
    }
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Number of Nodes:");
        int n=sc.nextInt();
        AVL_Tree tree =new AVL_Tree();
        for(int i=1;i<=n;i++){
          //  System.out.print("Add Element "+i+" :");
            tree.root=tree.insert(tree.root,sc.nextInt());
            
        }
        
        System.out.println("InOrder");
        tree.inOrder(tree.root);
        System.out.println("\n PreOrder");
        tree.PreOrder(tree.root);       
        System.out.println("\n PostOrder");
        tree.postOrder(tree.root);
       
    }
     
    
 int height(Node root){
     if(root==null)
        return 0;
     
    return root.hight;
 }   
    
  int getBalance(Node N){
      if(N==null)
          return 0;
      return height(N.left)-height(N.right);
  }  
    
  
  Node RotateLeft(Node x){
     Node y=x.right;
     Node t1=y.left;
     
      y.left=x;
      x.right=t1;
      //height update
      y.hight=Math.max(height(y.left), height(y.right))+1;
      x.hight=Math.max(height(x.left), height(x.right))+1;
      
      //return new root element
      return y;
  
  }
  Node RotateRight(Node x){
  
  Node y=x.left;
  Node t1=y.right;
  
  //rotate
  y.right=x;
  x.left=t1;
  
   y.hight=Math.max(height(y.left), height(y.right))+1;
   x.hight=Math.max(height(x.left), height(x.right))+1;
     
    //return new root element
    return y;  
  
  }
  
  
  Node insert(Node node,int data){
    
      if(node==null)
     {    return new Node(data);  
     }
     if(data<node.key){
        node.left= insert(node.left, data);
     }
     else if(data>node.key){
         node.right= insert(node.right, data);
     }else return node;
     
     node.hight=Math.max(height(node.left),height(node.right))+1;
     int balance=getBalance(node);
     
     if(balance >1 && data<node.left.key)
     {  return RotateRight(node);
     }
     else if(balance<-1 && data>node.right.key)
     {
        return RotateLeft(node);
     }
     
     else if(balance>1 && data>node.left.key){
          node.left=RotateLeft(node.left);
         return RotateRight(node);
     }
     else if(balance<-1 && data<node.right.key){
       node.right=RotateRight(node.right);
        return RotateLeft(node);
     }
     
     return node;
  }
  
  
  
  
  
  
  
  
    
 void inOrder(Node node){
      if(node==null)
          return;
      inOrder(node.left);
      System.out.print(" "+node.key);
      inOrder(node.right);
    }    
 
 
 void PreOrder(Node node){
  if(node==null)
      return;
     System.out.print(" "+node.key);
     PreOrder(node.left);
     PreOrder(node.right);      
 }
    
 void postOrder(Node node){
     if(node==null)
         return;
     postOrder(node.left);
     postOrder(node.right);
     System.out.print(" " +node.key);
 }
    
    
    
}

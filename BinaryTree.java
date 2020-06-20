/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class BinaryTree {
    
   static class node {
       int data;
       node right=null;
       node left=null;
    }
    public static node root=null;
    public static void main(String[] args) {
      insert(50); 
      insert(30); 
      insert(20); 
      insert(40); 
      insert(70); 
      insert(60); 
      insert(80); 
      inorder();   
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Total Elements In Tree");
//        int number =sc.nextInt();
//        
//        for(int i=0;i<number;i++){
//          int data=sc.nextInt();
//             insert(data);
//        
//        }
        System.out.println("  ------------------ ");
        System.out.print("\nInorder  : ");
        inorder();
        System.out.println("  ------------------ ");
        System.out.print("\npreOrder  : ");
        preOrder();
        System.out.println("  ------------------ ");
        System.out.print("\npostOrder  : ");
        postorder();
 }
      static void insert(int data){
    root=insertTo(root,data);
        
    }
    static node insertTo(node r,int data){
    
         if(r==null){
          node t=new node();
          t.data=data;
         r=t;
         return r;  
         }
        if(r.data>=data){
        r.left=insertTo(r.left, data);
        } else{
         r.right=insertTo(r.right, data);
        }
       return r;
    }
   static void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    static void inorderRec(node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(" "+root.data); 
            inorderRec(root.right); 
        } 
    } 
  
   static void preOrder(){
       preorderRec(root);
   }
     static void preorderRec(node node) 
    { 
        if (node == null) 
            return; 
        /* first print data of node */
        System.out.print(node.data + " "); 
        /* then recur on left sutree */
        preorderRec(node.left); 
        /* now recur on right subtree */
        preorderRec(node.right); 
    } 
   static void postorder()
   {
   printPostorder(root);
   }
   static void printPostorder(node node) 
    { 
        if (node == null) 
            return; 
  
        // first recur on left subtree 
        printPostorder(node.left); 
  
        // then recur on right subtree 
        printPostorder(node.right); 
  
        // now deal with the node 
        System.out.print(node.data  + " "); 
    } 
   
}
  // another insert method 
 /*   static boolean insert(int data){
      if(root==null){
         node t =new node();
         t.data=data;
         root=t;
       return true;
      }
      else{
         node temp=root;
          node parent=temp;
         while(temp!=null){
         if(temp.data>=data)
         {
             parent=temp;
           temp=temp.left;
         }else{
             parent=temp;
           temp=temp.right;
         }
     }     node n=new node();
            n.data=data;
            n.right=null;
            n.left=null;
         if(parent.data>=data){
           parent.left=n;
         }else  parent.right=n;
       return true;   
      }  
    //return false;
    }
   */ 
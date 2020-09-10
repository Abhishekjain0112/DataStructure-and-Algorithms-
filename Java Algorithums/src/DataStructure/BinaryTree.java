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
  public Node root=null;
   
    class Node{   
      int key;
      Node left;
      Node right;  
      Node(int data){
         this.key=data;
      }
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Number of Nodes:");
        int n=sc.nextInt();
        BinaryTree tree =new BinaryTree();
        for(int i=1;i<=n;i++){
            System.out.print("Add Element "+i+" :");
          // tree.insert(sc.nextInt());
            tree.insertbyRecurtion(tree.root,sc.nextInt());
        }
        
        System.out.println("InOrder");
        tree.inOrder(tree.root);
        System.out.println("\n PreOrder");
        tree.PreOrder(tree.root);
        
        System.out.println("\n PostOrder");
        tree.postOrder(tree.root);
        
    }
    
    //insert by recurtion
    void insertbyRecurtion(Node root,int data){
      
        if(this.root==null)
        {
         this.root=new Node(data);
         return;
        }
       if(data<root.key){
        
           if(root.left==null)
           {
              root.left=new Node(data);
              return;
           }else
           insertbyRecurtion(root.left,data);
       
       }else{
       
         if(root.right==null){
           root.right=new Node(data);
           return;
         }else
             insertbyRecurtion(root.right, data);

       }
     
    } 
    
    
    
    
        //insert by loop 
    public void insert(int info){
        
       Node node=new Node(info);
       if(root==null)
       {   root=node;
           return;
       }
       else{
       Node temp=root;
       while(temp!=null){
         if(temp.key>info ){
             if(temp.left==null){
                 System.out.println(info+" is inserted in the left of "+temp.key);
                 temp.left=node;
                 break;
                 }
             else{
                 temp=temp.left;
                 }
          }
         else{
            if(temp.right==null)
            {
              System.out.println(info+" is inserted in the Right of "+temp.key);
              temp.right=node;
              break;
            }
            else{
                temp=temp.right;
            }
         }
        }
       }    
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

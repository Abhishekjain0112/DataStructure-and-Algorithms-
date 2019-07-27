/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author Abhishek
 */
public class Stack {
    class node{
    int data;
    node next;
    }
    node top=null;
    
    public static void main(String[] args) {
 
        Stack stack=new Stack();
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(12);
        stack.push(100);
        stack.push(88);
        stack.push(55);
        System.out.println("pop :"+stack.pop());
        System.out.println("pop :"+stack.pop());
        
        stack.searchAll();
        
        
    }
   
  void push(int n){
  node temp=new node();
  temp.data=n;    
  if(top==null){
   top=temp;
  }
  else{
   temp.next=top;
   top=temp;
  } 
  }  
  
  int pop(){
  int  x=-1;
  if(top==null)return -1;
  x=top.data;
  top=top.next;
  return x;
  }
  
   void searchAll(){
     node temp=top;
       System.out.println("-------S T A C K------");
     while(temp!=null){
         System.out.println(temp.data);
       temp=temp.next;
     }
       
   
   }
    
    
}

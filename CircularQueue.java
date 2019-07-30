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
public class CircularQueue {
    class node{
    int data;
    node next;
    }
    
    node front=null;
    node rear=null;
    
    public static void main(String[] args) {
 
      CircularQueue qu=new CircularQueue();
      
      for(int i=0;i<5;i++){
        qu.enqueue(i);
      }
       qu.enqueue(55);
        System.out.println("dequeue :"+qu.dequeue());
        System.out.println("dequeue :"+qu.dequeue());
    qu.Show(10);    
        System.out.println("dequeue :"+qu.dequeue());
        
    }
   
  void enqueue(int n){
  node temp=new node();
  temp.data=n;    
  
  if(rear==null && front==null){
   rear=temp;
   front=temp;
  }
  else{
    rear.next=temp;
    rear=temp;
    rear.next=front;
  } 
  

  }  
  
  int dequeue(){
  node temp=front;
  if(front==null)
    return -1;
  int x=front.data;
   front=front.next;
   rear.next=front;
    return x;
  }
  
   void Show(int i){
     node temp=front;
       System.out.println("-------CIRCULAR   QUEUE------");
     while(i-->0){
         System.out.print("   "+temp.data);
       temp=temp.next;
     }
       
   
   }
    
    
}

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
public class Queue {
    class node{
    int data;
    node next;
    }
    
    node front=null;
    node rear=null;
    
    public static void main(String[] args) {
 
      Queue qu=new Queue();
      
      for(int i=0;i<10;i++){
        qu.enqueue(i);
      }
       qu.enqueue(55);
        System.out.println("dequeue :"+qu.dequeue());
        System.out.println("dequeue :"+qu.dequeue());
        System.out.println("dequeue :"+qu.dequeue());
    qu.Show();    
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
  } 
  

  }  
  
  int dequeue(){
  node temp=front;
  if(front==null)
    return -1;
  int x=front.data;
   front=front.next;
    return x;
  }
  
   void Show(){
     node temp=front;
       System.out.println("-------Q U E U E  ------");
     while(temp!=null){
         System.out.print("   "+temp.data);
       temp=temp.next;
     }
       
   
   }
    
    
}

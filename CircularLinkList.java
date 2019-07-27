/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import sun.awt.image.ImageWatched;

/**
 *
 * @author Abhishek
 */
public class CircularLinkList {
    class node{
    int data;
    node next;
    }
    node start=null;
    
    public static void main(String[] args) {
 
         CircularLinkList ls=new CircularLinkList();
         
         for(int i=1;i<7;i++){
           ls.insert(i);
         }
         ls.remove(5);
         
         ls.insert(45);
         ls.remove(45);
         
         ls.searchAll();
      
        
    }
   
  void insert(int n){
  node temp=new node();
  temp.data=n;    
  temp.next=null;
  
  if(start==null){
   start=temp;
   temp.next=start;
  }
  else{
    node pre=start;
    while(pre.next!=start){
      pre=pre.next;
              
    }
    temp.next=start; 
    pre.next=temp;
     
     
  } 
  }  
  
  void remove(int d){
 
  if(start.data==d){
     
      start=start.next;
             
   }else{
  node temp=start;
  
  while(temp!=null){
      if(temp.next.data==d){ 
      temp.next=temp.next.next;
       break;
      }           
     temp=temp.next;
             
  }
      
      }
      
  }
  
  
   void searchAll(){
     node temp=start;
       System.out.println("-------LINK  LIST ------");
    int i=10;
       while(i-->0){
         System.out.print("   "+temp.data);
       temp=temp.next;
     }
       
   
   }
    
    
}

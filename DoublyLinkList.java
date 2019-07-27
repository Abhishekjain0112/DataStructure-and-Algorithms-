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
public class DoublyLinkList {
    
     class node{
    int data;
    node next;
    node privious;
    }
    node start=null;
    
    public static void main(String[] args) {
 
         DoublyLinkList ls=new DoublyLinkList();
         
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
  
  if(start==null){
   start=temp;
  }
  else{
    node pre=start;
    while(pre.next!=null){
      pre=pre.next;
              
    }
     pre.next=temp;
     temp.privious=pre;
     
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
          if(temp.next==null)
              break;
         temp.next.privious=temp;
          
       break;
      }           
     temp=temp.next;
             
  }
      
      }
      
  }
  
  
   void searchAll(){
     node temp=start;
       System.out.println("-------LINK  LIST ------");
     while(temp!=null){
         System.out.print("   "+temp.data);
       temp=temp.next;
     }
   }
}

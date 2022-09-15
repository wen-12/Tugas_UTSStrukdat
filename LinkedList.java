/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasusuts;

/**
 *
 * @author HP-14s
 */
public class LinkedList {
    Node first;
    
    LinkedList()
     {
         this.first=null;
     }
     /*
     public linkedlist SimpulAwal(linkedlist list, int data){
         node new_node = new node(data);
         list.first=new_node;
         return list;
     }
*/
     public LinkedList InsertLast(LinkedList list, int data){
         Node new_node = new Node(data);
         new_node.next =null;
         if (list.first == null){
             list.first = new_node;
         }
         else{
             Node last;
             last = list.first;
             while(last.next != null){
                 last = last.next;
             }
             last.next = new_node;
         }
         return list;
     }
     public void PrintInfo(LinkedList list){
         Node P;
         P=list.first;
         System.out.println("linked list");
         while(P != null){
         System.out.print(P.info + " ");
         P=P.next;
     }
  }
    public LinkedList InsertFirst(LinkedList list, int data){
        Node new_node = new Node(data);
         new_node.next =null;
         if (list.first == null){
             list.first = new_node;
         }
         else{
             new_node.next = list.first;
             list.first = new_node;
         }
        return list;
    }
    
    public LinkedList InsertAfter(LinkedList list, int data, int idx){
        Node new_node = new Node(data);
         new_node.next =null;
         if (list.first == null){
             list.first = new_node;
         }
         else{
             Node prev;
             prev = list.first;
             int i = 0;
             while(i < idx-1 && prev != null){
                 prev = prev.next;
                 i++;
             }
             if(prev != null){
                 new_node.next = prev.next;
                 prev.next = new_node;
             }
             else{
                 System.out.println("data tidak lengkap");
             }
         }
         
        return list;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studikasusuts;

/**
 *
 * @author HP-14s
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //list.SimpulAwal(list, 6);
        list.InsertLast(list, 1);
        list.InsertLast(list, 2);
        list.InsertLast(list, 3);
        list.InsertLast(list, 4);
        
        list.PrintInfo(list);
        list.InsertFirst(list, 5);
        System.out.println("");
        list.PrintInfo(list);
        
        list.InsertAfter(list, 8, 3);
        System.out.println("");
        list.PrintInfo(list);
    }
    
}

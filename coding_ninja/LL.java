package coding_ninja;

import Linked_List.AllOperationOnLinkelist;

public class LL {
    public static Node<Integer> createLinkedList(){
        Node <Integer>n1=new Node<>(20);
        Node <Integer>n2=new Node<>(30);
        Node <Integer>n3=new Node<>(40);
        Node <Integer>n4=new Node<>(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
    public static void PrintList(Node n1){
        Node curr=n1;
        while(n1!=null){
            System.out.print(n1.data+"=>");
            n1=n1.next;
        }
        System.out.println("null");
    }
    public static void print(Node<Integer>head){
        System.out.println("Print"+ head);
        System.out.println(head.data);
        //System.out.print(head.next);
        System.out.print(head.next.data);
        System.out.print(head.next.next.data);
    }
    public static void main(String[] args) {
        //LL list=new LL();
       Node <Integer>head=createLinkedList();
      PrintList(head);
      print(head);
    }
}

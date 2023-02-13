package Linked_List;
import java.util.*;
public class InsertAtEnd {
    public static class LL{
        Node head;
        public class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }

        }
        public void addFirst(int data){
            Node curr=new Node(data);
            curr.next=head;
            head=curr;
        }
        public void printList(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"-->");
                curr=curr.next;
            }
            System.out.print("null");
        }
        public void addLast(int data){
            Node last=head;
            Node newNode=new Node(data);
            while (last.next!=null){
                last=last.next;

            }
            last.next=newNode;

        }

    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst(23);
        list.addFirst(45);
        list.addLast(4556);
        list.printList();


    }
}

package Linked_List;
import java.util.*;
public class AllOperationOnLinkelist {
    public static class LL{
        Node head;
        public class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void addFirst(int data){
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
        }
        public void addLast(int data){
            Node temp=new Node(data);
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=null;
        }
        public void addMiddle(int pos, int data){
            Node newNode=new Node(data);
            Node temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
        public void delFirst(){

            head=head.next;
        }
        public void delLast(){
            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
        public void NodeCount(){
            int count=0;
            while (head!=null){
                count++;
                head=head.next;
            }
            System.out.println(count);
        }
        public void insertAtPos(int data, int pos) {
            Node newNode = new Node(data);
            if (pos == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void MiddleOfLinkedList(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            temp=head;
            for (int i = 0; i < count/2; i++) {
                temp=temp.next;

            }
            System.out.println(temp.data);
        }
//        public void MiddleEfficient(){
//            if(head==null)
//                System.out.println("null");
//            Node slow=head;
//            Node fast=head;
//            while(fast!=null && fast.next!=null){
//                slow=slow.next;
//                fast=fast.next.next;
//            }
//            System.out.println(slow.data);
//        }
//        public void InsertAfterAGivenDAta(int data){
//            Node curr=head;
//            Node newNode=new Node(data);
//            while(curr!=null){
//                if(curr.data==data){
//                    curr=curr.next;
//                }
//            }
//        }
        public void printList(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"->");
                curr=curr.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list.printList();
        list.addLast(15);
        list.addLast(16);
        list.printList();
        list.delFirst();
        list.printList();
//        list.delLast();
//        list.printList();
//        list.delLast();
//        list.printList();
//        14->13->12->null
//        14->13->12->15->16->null
//        13->12->15->16->null
//        13->12->15->null
//        13->12->null
//        list.InsertAfterAGivenDAta(12);
//        list.printList();
//        list.MiddleOfLinkedList();
//        list.NodeCount();
//        list.MiddleEfficient();
        list.insertAtPos(344,2);
        list.printList();

    }
}

package Linked_List;
import java.util.*;

public class LinkedListByKunal {
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
        public void AddFirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        public void AddLast(int data){
            Node newNode=new Node(data);
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        public void delFirst(){
            head=head.next;

        }
        public void delLast(){
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr=curr.next;
        }
        public void addAtPostion(int data, int pos){
            Node newNode=new Node(data);
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                for(int i=0;i<pos-2;i++){

                }
            }
        }
        public void PrintList(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"-->");
                curr=curr.next;
            }
            System.out.println("null");
        }


    }
    public static void main(String args[]){
        LL list=new LL();
        list.AddFirst(12);
        list.AddFirst(13);
        list.AddFirst(14);
        list.AddFirst(15);
        list.PrintList();
        list.delFirst();
        list.PrintList();

    }

}

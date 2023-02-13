package Linked_List;

import  java.util.*;
public class InsertAtStart{
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
        public void Insert(int data){
            Node temp=new Node(data);
            temp.next=head;
            head=temp;
        }
        public void print(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"-->");
                curr=curr.next;
            }
            System.out.print("null");
        }
    }
    public static void main(String args[]){
        LL list=new LL();
        list.Insert(1);
        list.Insert(2);
        list.print();

    }

}
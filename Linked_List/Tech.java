package Linked_List;
import  java .util.*;
class LL{
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
        Node newNode=new Node(data);
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);

    }
}
public class Tech {
    public static void main(String[] args) {

    }

}

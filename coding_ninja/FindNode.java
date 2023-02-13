package coding_ninja;
import java.util.*;
public class FindNode {
    public static class LL{
        Node head;
        public class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                //next=null;
            }
        }
        public void AddFirst(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        public void printList(){
            while(head!=null){
                System.out.print(head.data+"-->");
                head=head.next;
            }
            System.out.println("null");
        }
        public void find(int x){
            Node temp=head;

            while(temp!=null){
                if(temp.data==x){
                    System.out.println("found at "+ temp);

                }
                else{
                    System.out.println("not fount");
                }
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.AddFirst(12);
        list.AddFirst(13);
        list.printList();
        list.find(12);

    }
}

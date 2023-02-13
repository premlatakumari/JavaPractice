package Linked_List;

public class DeleteNode {
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
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        //public void addLast(int data)
        public void delFirst(){
            if(head==null || head.next==null){
                return;
            }
            head=head.next;
        }
        public void Print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"==>");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst(23);
        list.addFirst(34);
        list.addFirst(25);
        list.addFirst(234);
        list.Print();
        list.delFirst();
        list.delFirst();
        list.Print();

    }
}

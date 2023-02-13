package Linked_List;

public class DeleteAgivenNode {
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
        public void Addfirst(int data){
            Node temp=new Node(data);

            temp.next=head;
            head=temp;
        }
        public void print(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"=>");
                curr=curr.next;
            }
            System.out.println("null");
        }
        public void delete(int d){
            Node temp=head;
            while (temp!=null){
                if(temp.data==d){
                    temp=temp.next;
                }
            }

        }
    }
    public static void main(String args[]){
      LL list=new LL();
      list.Addfirst(1);
      list.Addfirst(2);
      list.Addfirst(3);
        list.Addfirst(4);
        list.Addfirst(5);
        list.print();
        list.delete(4);
        list.print();


    }
}

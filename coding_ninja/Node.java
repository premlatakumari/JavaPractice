package coding_ninja;

public class Node <T> {
    T data;
    Node <T>next;
    Node(T data){
        this.data=data;
        //next=null; this statement is not required;
    }
}

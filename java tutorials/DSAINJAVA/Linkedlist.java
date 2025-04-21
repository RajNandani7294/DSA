package DSAINJAVA;

public class Linkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Reserve(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        Node temp=cur;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node node=new Node(1);
        node.next=new Node(2);
        node.next.next=new Node(3);
        node.next.next.next=new Node(4);
        Reserve(node);
    }
    
}

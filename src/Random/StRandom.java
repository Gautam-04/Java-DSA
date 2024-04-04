package Random;

public class StRandom {
    public static void main(String[] args) {
       SLL sll = new SLL();
       sll.Insertion(40);
       sll.Insertion(12);
       sll.display();
    }
}

class Node{
    int val;
    Node next;
}

class SLL{
    public Node head;

    public Node createLL(int val){
        head = new Node();
        Node node = new Node();
        node.val = val;
        node.next = null;
        head = node;
        return head;
    }
   public void Insertion(int val){
       if(head == null){
           createLL(val);
           return;
       }
       Node tempNode = head;
       while(tempNode.next != null){
           Node node = new Node();
           node.val = val;
           node.next = null;
           tempNode.next = node;
       }
   }

   public void display(){
       Node tempNode = head;
       while(tempNode != null){
           System.out.println(tempNode.val);
           tempNode = tempNode.next;
       }
   }
}
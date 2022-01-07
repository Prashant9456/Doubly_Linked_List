package Array2;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data=data;
        }
    }
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0 || head==null;
    }

    //Insert Element At Beginning
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }


    //Insert Element At Last
    public void insertEnd(int value){
        ListNode newNode =new ListNode(value);
        if(isEmpty()){
            head=newNode;

        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
        length++;
    }
    public void displayForword(){
        if(head==null){
            return;

        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        DoublyLinkedList sll = new DoublyLinkedList();
        //Main sll = new Main()   ->online compiler
        sll.head=new ListNode(10);
        sll.insertFirst(20);
        sll.insertEnd(400);
        sll.insertEnd(10);
        sll.insertFirst(30);
        sll.displayForword();


    }
}

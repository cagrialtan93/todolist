public class LinkedList {
    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public void addNode(LinkedListNode linkedListNode) {
        if (size == 0) {
            head = tail = linkedListNode;
        } else {
            linkedListNode.setNext(head);
            head = linkedListNode;
        }
        size++;
    }

    public void printLinkedList() {
        LinkedListNode current = head;
        while (current!= null) {
            System.out.println(current.getValueOf());
            current = current.getNext();
        }
    }

    public LinkedListNode getHead() {
        return head;
    }

    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    public LinkedListNode getTail() {
        return tail;
    }

    public void setTail(LinkedListNode tail) {
        this.tail = tail;
    }
}

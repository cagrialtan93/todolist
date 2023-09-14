public class LinkedList {
    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public void addNodeToHead(LinkedListNode linkedListNode) {
        if (size == 0) {
            head = tail = linkedListNode;
        } else {
            linkedListNode.setNext(head);
            head = linkedListNode;
        }
        size++;
    }

    public void addNodeWithOrder(LinkedListNode linkedListNode) {
        LinkedListNode current = head;
        if (size == 0) {
            head = tail = linkedListNode;
        } else {
            while (linkedListNode.getValueOf() > current.getValueOf()) {
                if (current.getNext() != null) {
                    if (linkedListNode.getValueOf() < current.getNext().getValueOf()){
                        linkedListNode.setNext(current.getNext());
                        current.setNext(linkedListNode);
                    } else {
                        current = current.getNext();
                    }
                } else {
                    current.setNext(linkedListNode);
                }
            }
        }
        size++;
    }

    public void printLinkedList() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.println(current.getValueOf());
            current = current.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

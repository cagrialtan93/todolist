import java.util.LinkedList;

public class LinkedListOfHell {
    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;
    private LinkedList<String> linkedList;

    public LinkedListOfHell(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public void addNodeWithOrder(LinkedListNode linkedListNode) {
        LinkedListNode current = head;
        if (size == 0) {
            head = tail = linkedListNode;
            size++;
        } else {
            if (head.getDate().compareTo(linkedListNode.getDate()) > 0) {
                linkedListNode.setNext(head);
                head.setPrevious(linkedListNode);
                head = linkedListNode;
            } else {
                while (linkedListNode.getDate().compareTo(current.getDate()) > 0) {
                    if (current.getNext() != null) {
                        if (linkedListNode.getDate().compareTo(current.getNext().getDate()) < 0) {
                            linkedListNode.setNext(current.getNext());
                            current.getNext().setPrevious(linkedListNode);
                            current.setNext(linkedListNode);
                            linkedListNode.setPrevious(current);
                            size++;
                        } else {
                            current = current.getNext();
                        }
                    } else {
                        current.setNext(linkedListNode);
                        linkedListNode.setPrevious(current);
                        size++;
                    }
                }
            }
        }
    }

    public void findTheNodeandRemove(String stringToFind){
        LinkedListNode current = this.getHead();
        while (!stringToFind.equals(current.getTagName())){
            current = current.getNext();
        }

        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    public void printLinkedList() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.println(current.getTagName() + " : " + current.getValueOf() + " - " + current.getDate());
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

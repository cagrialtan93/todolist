import java.util.LinkedList;

public class LinkedListNode {
    private LinkedListNode next;
    private LinkedListNode previous;
    private int valueOf;

    public LinkedListNode(int valueOf) {
        this.valueOf = valueOf;
    }

    public int getValueOf() {
        return valueOf;
    }

    public void setValueOf(int valueOf) {
        this.valueOf = valueOf;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public LinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedListNode previous) {
        this.previous = previous;
    }
}

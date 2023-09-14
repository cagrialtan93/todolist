import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListNode {
    private LinkedListNode next;
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
}

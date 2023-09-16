import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class LinkedListNode {
    private LinkedListNode next;
    private LinkedListNode previous;
    private LocalDate date;
    private String valueOf;
    private String tagName;

    public LinkedListNode() {
    }


    public LinkedListNode(LocalDate date, String valueOf, String tagName) {
        this.date = date;
        this.valueOf = valueOf;
        this.tagName = tagName;
    }

    public LinkedListNode getPrevious() {
        return previous;
    }


    public void setPrevious(LinkedListNode previous) {
        this.previous = previous;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getValueOf() {
        return valueOf;
    }

    public void setValueOf(String valueOf) {
        this.valueOf = valueOf;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}

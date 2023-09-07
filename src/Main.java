public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedListNode linkedListNode = new LinkedListNode(15);
        LinkedListNode secondLinkedListNode = new LinkedListNode(16);

        linkedList.addNode(linkedListNode);
        linkedList.addNode(secondLinkedListNode);

        linkedList.printLinkedList();
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedListNode linkedListNode = new LinkedListNode(21);
        LinkedListNode secondLinkedListNode = new LinkedListNode(22);
        LinkedListNode thirdLinkedListNode = new LinkedListNode(24);
        LinkedListNode fourthLinkedListNode = new LinkedListNode(25);
        LinkedListNode fifthLinkedListNode = new LinkedListNode(23);
        LinkedListNode number20 = new LinkedListNode(20);
        LinkedListNode number29 = new LinkedListNode(29);
        LinkedListNode number27 = new LinkedListNode(27);

        linkedList.addNodeWithOrder(linkedListNode);
        linkedList.addNodeWithOrder(secondLinkedListNode);
        linkedList.addNodeWithOrder(thirdLinkedListNode);
        linkedList.addNodeWithOrder(fourthLinkedListNode);
        linkedList.addNodeWithOrder(fifthLinkedListNode);
        linkedList.addNodeWithOrder(number20);
        linkedList.addNodeWithOrder(number29);
        linkedList.addNodeWithOrder(number27);


        linkedList.printLinkedList();
    }
}
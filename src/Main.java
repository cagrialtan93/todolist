import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedListOfHell linkedListOfHell = new LinkedListOfHell(linkedList);
        LinkedListNode linkedListNodeFirst = new LinkedListNode(LocalDate.of(2023, 12, 12), "Markete git", "Market");
        LinkedListNode linkedListNodeSecond = new LinkedListNode(LocalDate.of(2023, 10, 3), "Ders çalış", "Study");
        LinkedListNode linkedListNodeThird = new LinkedListNode(LocalDate.of(2023, 5, 2), "Mayayı gezdir", "Walk");
        LinkedListNode linkedListNodeFourth = new LinkedListNode(LocalDate.of(2024, 5, 3), "Spor yap", "Lift");

        linkedListOfHell.addNodeWithOrder(linkedListNodeFirst);
        linkedListOfHell.addNodeWithOrder(linkedListNodeSecond);
        linkedListOfHell.addNodeWithOrder(linkedListNodeThird);
        linkedListOfHell.addNodeWithOrder(linkedListNodeFourth);

        System.out.println(linkedListOfHell.getHead().getPrevious());

        new LandingPage(linkedListOfHell);


    }
}

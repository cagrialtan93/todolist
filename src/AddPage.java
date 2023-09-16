import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class AddPage {
    private String userInput;
    private String userInputDate;
    private LinkedListNode linkedListNode = new LinkedListNode();
    private LocalDate date;
    private SimpleDateFormat simpleDateFormat;

    public AddPage(LinkedListOfHell linkedListOfHell) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us your todo: ");
        userInput = scanner.next();

        System.out.println("Give us the tagname for your todo");
        String tagNameUserInput = scanner.next();

        // Prompt the user and get the first input
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Prompt the user and get the second input
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        // Prompt the user and get the third input
        System.out.print("Enter the date: ");
        int date = scanner.nextInt();

        linkedListNode.setDate(LocalDate.of(year, month, date));
        linkedListNode.setValueOf(userInput);
        linkedListNode.setTagName(tagNameUserInput);
        linkedListOfHell.addNodeWithOrder(linkedListNode);

    }
}

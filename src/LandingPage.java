import java.util.Scanner;

public class LandingPage {
    private LinkedListOfHell linkedListOfHell;

    public LandingPage(LinkedListOfHell linkedListOfHell) {
        System.out.println("Welcome");
        System.out.println("1. Show the list");
        System.out.println("2. Add an element to the list");
        System.out.println("3. Remove an element from the list");
        System.out.println("4. Exit");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput == 1 || userInput == 2 || userInput == 3) {
                if (userInput == 1) {
                    linkedListOfHell.printLinkedList();
                } else if (userInput == 2) {
                    new AddPage(linkedListOfHell);
                    System.out.println("################################");
                    linkedListOfHell.printLinkedList();
                } else if (userInput == 3) {
                    linkedListOfHell.printLinkedList();
                    System.out.println("Please give us the name of the element you want to remove: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String userInputForDeletion = scanner1.next();
                    linkedListOfHell.findTheNodeandRemove(userInputForDeletion);

                    linkedListOfHell.printLinkedList();
                } else {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            }
            break;
        }
    }
}

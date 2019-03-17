package observer;

public class MainObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new US_Observer(subject);
        new Tokyo_Obsrver(subject);
       // new BinaryObserver(subject);

        System.out.println("First state Warsow: 15");
        subject.setTime(15);
        System.out.println("Second state Warsow: 10");
        subject.setTime(10);

    }
}

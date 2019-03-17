package observer;

public class Tokyo_Obsrver extends Observer {
    public Tokyo_Obsrver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

        System.out.println("W Tokyo jest: " + (subject.getTime() + 8) + " H");

    }
}

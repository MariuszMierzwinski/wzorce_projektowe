package observer;

public class US_Observer extends Observer {
    public US_Observer(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

        System.out.println( "W Stanach jest: " +  (subject.getTime()+4)+ " H");

    }
}

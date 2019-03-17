public class EagerInitialzedSingelton {
    private static final EagerInitialzedSingelton instance= new EagerInitialzedSingelton();
    private static int count;{
        count++;
    }
    //Prywatny konstruktor wywołany tylko z wnętrza clasy;
    private EagerInitialzedSingelton(){
        System.out.println("I became");

    }
    public static EagerInitialzedSingelton getInstance(){
        System.out.println("I am now");
        return instance;
    }
    public int getCount(){
        return count;
    }
}

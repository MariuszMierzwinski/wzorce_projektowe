public class BillPughSingeleton {
    private BillPughSingeleton() {
    }

    private static class SingeltonHelper {
        private static final BillPughSingeleton INSTANCE = new BillPughSingeleton();

    }

    public static BillPughSingeleton getInstance() {
        return SingeltonHelper.INSTANCE;

    }
}

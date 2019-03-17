public class LuxuryCar extends BetterCar {
    public LuxuryCar(Car betterCar){
        super(betterCar);
    }
    @Override
    public String getDescription() {
       return betteCar.getDescription() + " Special futures";
    }

}

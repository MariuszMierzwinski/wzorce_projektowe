public class Truck extends BetterCar {
    public Truck(Car betterCar){
        super(betterCar);
    }
    @Override
    public String getDescription() {
        return betteCar + " Extra space for equipment";
    }
}

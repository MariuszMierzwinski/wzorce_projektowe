public class RaceCar extends  BetterCar {
    public RaceCar(Car betterCar){
        super(betterCar);
    }
    @Override
    public String getDescription() {
        return betteCar.getDescription()+" Super Engine";
    }
}


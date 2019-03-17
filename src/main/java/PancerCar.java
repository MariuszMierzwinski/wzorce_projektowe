public class PancerCar extends BetterCar {
    public PancerCar(Car betterCar){
        super(betterCar);
    }
    @Override
    public String getDescription() {
        return betteCar.getDescription()+ " Pancer Glass ";
    }
}

public class ColorFactory extends Factory {
    @Override
    String getSchape(String schape) {
        return " ";
    }

    @Override
    String getColor(String type) {

        switch(type){
            case"B": return "Black";
            case"W": return "White";
            case"R": return "Red";
            case"G": return "Green";
            default:return "Uknnow";
        }
    }
}

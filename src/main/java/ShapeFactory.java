public class ShapeFactory extends Factory {
    @Override
    String getSchape(String type) {
        switch (type){
            case "C": return "Circle";
            case "R": return "Reactangle";
            case "S":return "Squer";
            default: return "Unknow";
        }

    }

    @Override
    String getColor(String type) {
        return " ";
    }
}

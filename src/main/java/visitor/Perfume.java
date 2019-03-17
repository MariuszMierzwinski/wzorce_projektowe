package visitor;

public class Perfume implements Element{
    private String title;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private float weight;

    public Perfume(String title,float price,float weight){
        this.title=title;
        this.price=price;
        this.weight=weight;
    }


    public float accept(MyVisitor visitor) {
        return visitor.visit(this);
    }
}

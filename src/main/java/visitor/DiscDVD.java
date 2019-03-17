package visitor;

public class DiscDVD implements Element {
    private String title;
    private float price;
    private float weight;
    private boolean inPromotion = false;


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

    public boolean isInPromotion() {
        return inPromotion;
    }

    public void setInPromotion(boolean inPromotion) {
        this.inPromotion = inPromotion;
    }


    public DiscDVD(String title,float price,float weight){
        this.title=title;
        this.price=price;
        this.weight=weight;
    }

    public float accept(MyVisitor visitor) {
        return visitor.visit(this);
    }
}

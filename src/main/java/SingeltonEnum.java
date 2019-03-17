public enum SingeltonEnum {
    GREEN("Green"),
    BLUE("Blue"),
    BLACK("Black"),
    RED("Red");
    private String color;
    private SingeltonEnum(String color){
        this.color=color;
    }
    public void getInfo(){
        System.out.println("Eyes color: "+color.toLowerCase());
    }
}

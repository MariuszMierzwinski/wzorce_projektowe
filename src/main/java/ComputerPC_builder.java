public class ComputerPC_builder {
    private String name;
    private String graphicCard;
    private int hddCapacity;
    private String screenResolution;
    private String cpuName;//**
    private int ramSize;//**
    private String mainBoard;//**

    @Override
    public String toString() {
        return "ComputerPC_builder{" +
                "name='" + name + '\'' +"\n"+
                ", graphicCard='" + graphicCard + '\'' +"\n"+
                ", hddCapacity=" + hddCapacity +
                ", screenResolution='" + screenResolution + '\'' +"\n"+
                ", cpuName='" + cpuName + '\'' +"\n"+
                ", ramSize=" + ramSize +"\n"+
                ", mainBoard='" + mainBoard + '\'' +"\n"+
                '}';
    }

    public ComputerPC_builder(PCMaker builder) {
        this.name=builder.name;
        this.graphicCard=builder.graphicCard;
        this.hddCapacity=builder.hddCapacity;
        this.screenResolution=builder.screenResolution;
        this.cpuName=builder.cpuName;
        this.ramSize=builder.ramSize;
        this.mainBoard=builder.mainBoard;
    }

    public String about() {
        return this.toString();
    }

    public static class PCMaker{
    private String name;
    private String graphicCard;
    private int hddCapacity;
    private String screenResolution;
    private String cpuName;//**
    private int ramSize;//**
    private String mainBoard;//**

    public PCMaker(String cpuName, int ramSize, String mainBoard) {
        //must have
        this.cpuName = cpuName;
        this.ramSize = ramSize;
        this.mainBoard = mainBoard;
        //optional
        this.name="Standard PC";
        this.graphicCard="Integreted";
        this.hddCapacity=0;
        this.screenResolution="1024x720";
    }

    public PCMaker computerName(String name){
        this.name=name;
        return this;
    }
    public PCMaker addGraphicCard(String card){
        this.graphicCard=card;
        return this;
    }
    public PCMaker addHDD(int hdd){
        this.hddCapacity=hdd;
        return this;
    }
    public PCMaker screanResolution(String screenResolution){
        this.screenResolution=screenResolution;
        return this;
    }
    public ComputerPC_builder build(){
        return new ComputerPC_builder(this);
    }
}

}

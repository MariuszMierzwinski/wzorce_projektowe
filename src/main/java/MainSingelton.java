public class MainSingelton {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++Singelton+++++++++++++++++++++");
        EagerInitialzedSingelton singelton1 = EagerInitialzedSingelton.getInstance();
        System.out.println(singelton1.getCount());

        EagerInitialzedSingelton singelton2 = EagerInitialzedSingelton.getInstance();
        System.out.println(singelton2.getCount());

        EagerInitialzedSingelton singelton3 = EagerInitialzedSingelton.getInstance();
        System.out.println(singelton3.getCount());

        //  final EagerInitialzedSingelton singelton = new EagerInitialzedSingelton();

        SingeltonEnum.BLACK.getInfo();
        SingeltonEnum.BLUE.getInfo();
        SingeltonEnum.RED.getInfo();
        SingeltonEnum.GREEN.getInfo();
        System.out.println("++++++++++++++++++++++++BUILDER+++++++++++++++++++++");
        ComputerPC_builder pc1 = new ComputerPC_builder.PCMaker("Intel", 512, "Astrock").build();
        ComputerPC_builder pc2 = new ComputerPC_builder.PCMaker("Intel", 512, "Astrock")
                .addGraphicCard("N Vidia")
                .addHDD(1024)
                .computerName("Dell")
                .build();
        System.out.println(pc1.about());
        System.out.println(pc2);
        System.out.println("++++++++++++++++++++++++Factory+++++++++++++++++++++");
        ColorFactory cf=new ColorFactory();
        ShapeFactory sf=new ShapeFactory();

        System.out.println(cf.getColor("R"));
        System.out.println(cf.getColor("G"));
        System.out.println(cf.getColor("W"));

        System.out.println("SHAPES");
        System.out.println(sf.getSchape("T"));
        System.out.println(sf.getSchape("W"));

        System.out.println("++++++++++++++++++++++++Decorator+++++++++++++++++++++");

        Car car1=new PancerCar(new LuxuryCar(new RaceCar(new OrdinaryCar())));
        Car car2=new LuxuryCar(new RaceCar(new PancerCar(new OrdinaryCar())));
        Car car4=new LuxuryCar(new RaceCar(new Truck(new OrdinaryCar())));
        Car car3=new OrdinaryCar();
        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());
        System.out.println(car3.getDescription());
        System.out.println(car4.getDescription());
    }
}

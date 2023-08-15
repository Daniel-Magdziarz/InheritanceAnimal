public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt", "big", 50);
    }

    public Dog(String type, double weight, String earShape, String tailShape){
        super(type, weight < 15 ? "small" : weight < 35 ? "medium" : "Large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type.equalsIgnoreCase("Wolf")){
            System.out.println("Ow Wooooo");
        }
        bark();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed.equalsIgnoreCase("slow")) {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    public void walk(){
        System.out.print("Dog walking ");
    }

    public void wagTail(){
        System.out.print("Tail wagging ");
    }

    public void run(){
        System.out.print("Dog running ");
    }

    public void bark(){
        System.out.print("Woof! ");
    }

    public void getEarShape(){
        System.out.println(earShape);
    }

}

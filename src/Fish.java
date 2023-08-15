public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins){
        super(type, weight < 10 ? "small" : weight < 25 ? "medium" : "large", weight);
        this.gills = gills;
        this.fins = fins;
    }

    public void moveMuscles(){
        System.out.print("Muscles moving ");
    }

    public void moveBackFin(){
        System.out.print("Back fin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed.equalsIgnoreCase("fast")){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}

/*This is a great example in using inheritance. Animal stores generic characteristics of all
animals and Dog and fish inherit these, but also expand on them by providing unique characteristics
to Dog and Fish.
 */

public class Main {

    public static void main(String[] args) {


        Animal animal = new Animal("Dinosaur", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Gold fish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println("_ _ _ _ _ _ _");
    }



}

package homework;

public class ObjectsHW {

    public static void main(String[] args) {

        Animal jojo = new Animal("Jojo", 4, 4, false, false, true, true);
        Animal arni = new Animal("Arni", 4, 4, false, false, false, false);
        Animal jery = new Animal("Jery", 1, 4, false, true, true, true);
        Animal cat = new Animal("Cat", 3, 4, false, true, true, true);
        Animal dog = new Animal("Doggy", 2, 4, false, false,false, true);
        Animal parrot = new Animal("Parrot", 0, 2, false, true, false, true);
        Animal pig = new Animal("Piggy", 3, 4, true);

        jojo.feed();
        jojo.play();
        jojo.walk();
        jojo.walk();
        jojo.walk();
        parrot.walk();
        parrot.play();
        parrot.feed();
        parrot.play();
        dog.play();
        dog.feed();
        dog.play();
        jery.play();
        jery.walk();
        parrot.goSleep();






    }
}

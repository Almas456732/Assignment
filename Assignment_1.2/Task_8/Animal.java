public  class Animal {
    String name;
    String food;
    String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }


}

class Dog extends Animal {
    String breed;

    public Dog(String name,String breed, String food, String location) {
        super(name, food, location);
        this.breed = breed;
    }

    void makeNoise() {
        System.out.println("Woof!");
    }

    void eat() {
        System.out.println("Dog is eating " + food + " at " + location);
    }

    void getDescription() {
        System.out.println("This is a dog at " + location + ".");
    }
}

class Cat extends Animal {
    String furColor;

    // Constructor
    public Cat(String name,String furColor, String food, String location) {
        super(name, food, location);
        this.furColor = furColor;
    }

    void makeNoise() {
        System.out.println("Meow!");
    }

    void eat() {
        System.out.println("Cat is eating " + food + " at " + location);
    }

    void getDescription() {
        System.out.println("This is a cat at " + location + ".");
    }
}

class Horse extends Animal {
    String maneColor;

    public Horse(String name, String maneColor, String food, String location) {
        super(name, food, location);
        this.maneColor = maneColor;
    }

    void makeNoise() {
        System.out.println("Neigh!");
    }

    void eat() {
        System.out.println("Horse is eating " + food + " at " + location);
    }

    void getDescription() {
        System.out.println("This is a horse at " + location + ".");
    }
}

class Main2 {
    public static void main(String[] args) {
        Dog obj1 = new Dog("Dog", "Buddy", "Barbeye", "Backyard");
        obj1.makeNoise();
        obj1.eat();
        obj1.getDescription();

        Cat obj2 = new Cat("Cat", "Snowball", "Fish", "Living Room");
        System.out.println();
        obj2.makeNoise();
        obj2.eat();
        obj2.getDescription();

        Horse obj3 = new Horse("Horse", "Thunder", "Barbecue", "Pasture");
        System.out.println();
        obj3.makeNoise();
        obj3.eat();
        obj3.getDescription();
        String[] array={ obj1.name ,obj2.name,obj3.name};
        for (String i:array){
            System.out.println(i);
        }
    }
}




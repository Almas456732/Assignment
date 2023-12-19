
public class Veterinary {
    public Veterinary() {
    }

    public void treatAnimal(Animal animal){

            System.out.print(animal.name + " come from");
            System.out.println(" " + animal.location);



    }
    public static void main(String[] args){
        Animal dog = new Dog("Dog", "Buddy", "Barbeye", "Backyard");
        Animal horse = new Horse("Cat", "Thunder", "Barbecue", "Pasture");
        Animal cat = new Cat("Horse", "Snowball", "Fish", "Living Room");
        // Create an instance of the Veterinary class
        Veterinary vet = new Veterinary();

        // Call the treatAnimal method with the Animal instance
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
    }
}

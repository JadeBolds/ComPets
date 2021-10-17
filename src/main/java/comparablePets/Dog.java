package comparablePets;

public class Dog extends Pet {

    public Dog(Pet pet, int howManyPets, String petType, String petName) {
        super(pet, howManyPets, petType, petName);
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
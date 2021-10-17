package comparablePets;

public class Cat extends Pet{

    public Cat(Pet pet, int howManyPets, String petType, String name) {
        super(pet, howManyPets, petType, name);
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }
}

package comparablePets;

public class Servant extends Pet{

    public Servant(Pet pet, int howManyPets, String petType, String petName) {
        super(pet, howManyPets, petType, petName);
    }

    @Override
    public void speak(){
        System.out.println("Yes Master");
    }
}

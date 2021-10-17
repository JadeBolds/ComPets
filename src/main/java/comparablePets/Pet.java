package comparablePets;

public abstract class Pet {
    private String name;

    int howManyPets;
    String petType;


    public Pet(Pet pet, int howManyPets, String petType, String name ){
        this.howManyPets = howManyPets;
        this.petType = petType;
        //this.petName= petName;
        //return "";
    }

    public void speak(){
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", howManyPets=" + howManyPets +
                ", petType='" + petType + '\'' +
                '}';
    }
}

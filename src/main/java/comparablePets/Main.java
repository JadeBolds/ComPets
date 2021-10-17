package comparablePets;

import java.util.Scanner;

public class Main {

    //String[] petInfo;
    String whatPetSays = "";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] usersPets;
        //ArrayList<Pet> petList = new ArrayList<Pet>();
        //petList.add();
        System.out.println("How many pets do you have?");
        String howManyPets = scanner.nextLine();
        Integer howManyInt = Integer.valueOf(howManyPets);


        for (int pets = 0; pets < howManyInt; pets++) {
            System.out.println("What is your pets name?");
            String name = scanner.nextLine();

            System.out.println("What kind of pet is " + name + "?");
            String kindOfPet = scanner.nextLine();


            if(Pet.equalsIgnoreCase("Cat")) {
                Cat cat = new Cat(name, kindOfPet, whatPetSays);
                usersPets.add(cat);
            } else if (kindOfPet.equalsIgnoreCase("Dog")){
                Dog dog = new Dog(name, kindOfPet, whatPetSays);
                usersPets.add(dog);
            } else if (kindOfPet.equalsIgnoreCase("Snake")){
                Snake snake = new Snake(name, kindOfPet, whatPetSays);
                usersPets.add(snake);
            } else{
                System.out.println("Invalid Pet Type");
            }
        }

        System.out.println(petList);
    }
}

package be.intechbrussel.association;

public class AssociationApp {
    public static void main(String[] args) {
        /*HigherLowerGame myObject = new HigherLowerGame();
        myObject.higherLowerGame(52);
      int compareGuessValue =  myObject.guess(42);
        System.out.println(compareGuessValue);*/
        Pet pet = new Pet("dog");

        //System.out.println(pet.getName());
        Owner owner = new Owner("Person");
        owner.setPet(pet);

        Pet myPet = owner.getPet();
        System.out.println(myPet.toString());
    }
}

package be.intechbrussel.association;

public class Pet {
    private String name;
    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return getName();
    }
}

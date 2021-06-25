import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Zoo {
    private static Zoo instance = null;
    private ArrayList<Animal> animalsList;
    private int hungerLevel;
    private int happinessLevel;
    private HashMap<String, Integer> mapAnimals;
    private ArrayList<ZooObserver> observers;

    private Zoo() {
        this.animalsList = new ArrayList<Animal>();
        this.hungerLevel = 3;
        this.happinessLevel = 2;
        this.mapAnimals = new HashMap<String, Integer>();
        this.observers = new ArrayList<ZooObserver>();
    }

    public static Zoo getInstance() {
        if(instance == null) {
            instance = new Zoo();
            System.out.println("Creating zoo...");
        }
        else
            System.out.println("The zoo already exists...");
        return instance;
    }

    public void addAnimal(Animal animal) {
        if(!this.mapAnimals.containsKey(animal.getName()))
            this.mapAnimals.put(animal.getName(), 0);
        this.mapAnimals.replace(animal.getName(), this.mapAnimals.get(animal.getName()) + 1);
        this.animalsList.add(animal);
        // Need to notify
    }

    public void feedAnimals() {
        this.hungerLevel--;
        for(int i = 0; i < this.animalsList.size(); i++) {
            this.animalsList.get(i).feedRole();
        }
        // Should update observer and print
    }

    public void watchAnimals() {
        this.happinessLevel++;
        this.hungerLevel++;
        for(int i = 0; i < this.animalsList.size(); i++) {
            this.animalsList.get(i).showRole();
        }
        //Should update observer and print
    }

    public void addObserver(ZooObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(ZooObserver observer) {
        if(this.observers.contains(observer))
            this.observers.remove(observer);
    }

    public void showAnimalsInfo() {
        System.out.println("The zoo contains total of " +
                this.animalsList.size()+ " animals:");
        for(String name: this.mapAnimals.keySet()) {
            System.out.println("- " + name + ": " + this.mapAnimals.get(name));
        }
        System.out.println("Happiness level: " + this.happinessLevel);
        if(this.happinessLevel < 3)
            System.out.println("The animals are not happy, you should watch them...");
        else if(this.happinessLevel > 3)
            System.out.println("The animals are very happy, keep working hard...");
        System.out.println("Hunger level: " + this.hungerLevel);
        if(this.hungerLevel > 3)
            System.out.println("The animals are hungry, you should feed them...");

        
    }


}

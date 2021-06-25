import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
    private static Zoo instance = null;
    private ArrayList<Animal> animalsList;
    private int hungerLevel;
    private int happinessLevel;
    private HashMap<String, Integer> mapAnimals;
    private ArrayList<ZooObserver> observers;
    private String messageType = "";
    private static int START_HUNGER = 3;
    private static int START_HAPPINESS = 2;
    private static int MINIMUM_GENERAL_HAPPINESS = 3;
    private static int MAXIMUM_LEVEL = 5;
    private static int MINIMUM_LEVEL = 1;


    /**
     * Constructor for Zoo
     * Sets hunger level and happiness level to default, and creates new
     * observers list
     */
    private Zoo() {
        this.animalsList = new ArrayList<Animal>();
        this.hungerLevel = START_HUNGER;
        this.happinessLevel = START_HAPPINESS;
        this.mapAnimals = new HashMap<String, Integer>();
        this.observers = new ArrayList<ZooObserver>();
    }

    /**
     * Creates new zoo in singleton method
     * return the created zoo
     */
    public static Zoo getInstance() {
        if(instance == null) {
            instance = new Zoo();
            System.out.println("Creating zoo...");
        }
        else
            System.out.println("The zoo already exists...");
        return instance;
    }

    /**
     * Adds new animal to zoo, and notifies observers
     */
    public void addAnimal(Animal animal) {
        String animalName = animal.getName();
        if(!this.mapAnimals.containsKey(animalName))
            this.mapAnimals.put(animalName, 0);
        this.mapAnimals.replace(animalName,
                this.mapAnimals.get(animalName) + 1);
        this.animalsList.add(animal);

        this.messageType = animalName + " has been added to the zoo!";
        notifyObserver();
    }

    /**
     * Feeds all animals in the zoo, and notifies observers
     */
    public void feedAnimals() {
        if (this.hungerLevel > MINIMUM_LEVEL)
            this.hungerLevel--;
        for(int i = 0; i < this.animalsList.size(); i++) {
            this.animalsList.get(i).feedRole();
        }

        this.messageType = "The animals are being fed";
        notifyObserver();
    }

    /**
     * Starts animals' watch, and notifies observers
     */
    public void watchAnimals() {
        if (this.happinessLevel < MAXIMUM_LEVEL)
            this.happinessLevel++;
        if (this.hungerLevel < MAXIMUM_LEVEL)
            this.hungerLevel++;
        for(int i = 0; i < this.animalsList.size(); i++) {
            this.animalsList.get(i).showRole();
        }

        this.messageType = "The animals are being watched";
        notifyObserver();
    }

    /**
     * Notifies observers in changes
     */
    public void notifyObserver() {
        System.out.println("Notifying observers:");
        for (ZooObserver observer : this.observers) {
            observer.display(this.messageType);
        }
    }

    /**
     * Adds new observer to list
     */
    public void addObserver(ZooObserver observer) {
        this.observers.add(observer);
    }

    /**
     * Remove observer from list
     */
    public void removeObserver(ZooObserver observer) {
        if(this.observers.contains(observer))
            this.observers.remove(observer);
    }

    /**
     * Prints zoo general information
     */
    public void showAnimalsInfo() {
        System.out.println("The zoo contains total of " +
                this.animalsList.size()+ " animals:");

        for(String name: this.mapAnimals.keySet()) {
            System.out.println("- " + name + ": " + this.mapAnimals.get(name));
        }
        System.out.println("Happiness level: " + this.happinessLevel);

        if(this.happinessLevel < MINIMUM_GENERAL_HAPPINESS)
            System.out.println("The animals are not happy, you should watch " +
                    "them...");
        else
            System.out.println("The animals are very happy, keep working " +
                    "hard...");
        System.out.println("Hunger level: " + this.hungerLevel);

        if(this.hungerLevel > MINIMUM_GENERAL_HAPPINESS)
            System.out.println("The animals are hungry, you should feed " +
                    "them...");
    }
}

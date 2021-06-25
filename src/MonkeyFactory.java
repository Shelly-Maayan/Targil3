public class MonkeyFactory extends AnimalFactory {
    /**
     * Creates new object from type Monkey.
     * Returns the Monkey Object.
     */
    @Override
    public Animal createAnimal() {
        return new Monkey();
    }
}

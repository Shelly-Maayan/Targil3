public class UnicornFactory extends AnimalFactory {
    /**
     * Creates new object from type Unicorn.
     * Returns the Unicorn Object.
     */
    @Override
    public Animal createAnimal() {
        return new Unicorn();
    }
}

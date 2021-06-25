public class ZebraFactory extends AnimalFactory {
    /**
     * Creates new object from type Zebra.
     * Returns the Zebra Object.
     */
    @Override
    public Animal createAnimal() {
        return new Zebra();
    }
}

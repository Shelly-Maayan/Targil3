public class Zebra extends Animal {
    /**
     * Gets Zebra's name.
     * Returns Zebra's name.
     */
    @Override
    public String getName() {
        return "Zebra";
    }

    /**
     * Prints Zebra's role at the show.
     */
    @Override
    public void showRole() {
        System.out.println("The zebra is running...");
    }

    /**
     * Prints Zebra's feeding message.
     */
    @Override
    public void feedRole() {
        System.out.println("The zebra is eating grass...");
    }

}

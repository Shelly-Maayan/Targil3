public class Unicorn extends Animal {
    /**
     * Gets Unicorn's name.
     * Returns Unicorn's name.
     */
    @Override
    public String getName() {
        return "Unicorn";
    }

    /**
     * Prints Unicorn's role at the show.
     */
    @Override
    public void showRole() {
        System.out.println("The unicorn is flying...");
    }

    /**
     * Prints Unicorn's feeding message.
     */
    @Override
    public void feedRole() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }
}

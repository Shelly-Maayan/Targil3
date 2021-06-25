public class Monkey extends Animal {
    /**
     * Gets monkey's name.
     * Returns monkey's name.
     */
    @Override
    public String getName() {
        return "Monkey";
    }

    /**
     * Prints monkey's role at the show.
     */
    @Override
    public void showRole() {
        System.out.println("The monkey is hanging on trees...");
    }

    /**
     * Prints monkey's feeding message.
     */
    @Override
    public void feedRole() {
        System.out.println("The monkey is eating a banana...");
    }
}

public class ZooObserver {

    private String name;

    /**
     * initialize observer's name.
     * @param name observer's name.
     */
    public ZooObserver(String name) {
        this.name = name;
    }

    /**
     * Prints a message of the updated situation in zoo.
     * @param messageType the message to print.
     */
    public void display(String messageType) {
        System.out.println("[" + this.name + "] " + messageType);
    }
}

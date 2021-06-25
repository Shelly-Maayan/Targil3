public class ZooObserver {

    private String name;

    public ZooObserver(String name) {
        this.name = name;
    }

    public void display(String messageType) {
        System.out.println("[" + this.name + "] " + messageType);
    }
}

public class Unicorn extends Animal {
    @Override
    public String getName() {
        return "Unicorn";
    }

    @Override
    public void showRole() {
        System.out.println("The unicorn is flying...");
    }

    @Override
    public void feedRole() {
        System.out.println("The unicorn is eating rainbow cakes...");
    }
}

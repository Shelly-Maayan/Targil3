public class Zebra extends Animal{
    @Override
    public String getName() {
        return "Zebra";
    }

    @Override
    public void showRole() {
        System.out.println("The zebra is running...");
    }

    @Override
    public void feedRole() {
        System.out.println("The zebra is eating grass...");
    }

}

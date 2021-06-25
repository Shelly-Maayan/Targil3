public class Monkey extends Animal{
    @Override
    public String getName() {
        return "Monkey";
    }
    @Override
    public void feedRole() {
        System.out.println("The monkey is eating a banana...");
    }

    @Override
    public void showRole() {
        System.out.println("The monkey is hanging on trees...");
    }
}

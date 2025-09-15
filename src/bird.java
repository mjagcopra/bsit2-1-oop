public class Bird extends Pet implements Trainable {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Tweet! Tweet!";
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Flies in circles and lands on perch");
    }
}

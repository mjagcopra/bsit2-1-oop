public class Dog extends Pet implements Trainable {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public void performTrick() {
        System.out.println("Training " + name + ": Sits and shakes hands");
    }
}

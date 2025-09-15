public abstract class Pet {

    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    public void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age);
        System.out.println(name + " says: " + makeSound());
    }
}

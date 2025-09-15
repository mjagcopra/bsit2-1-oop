public class Main {
    public static void main(String[] args) {

        PetService services = new PetService();
        System.out.println("Basic checkup: $" + services.calculateFee());
        System.out.println("Checkup with vaccination: $" + services.calculateFee(true));
        System.out.println("Full service: $" + services.calculateFee(true, true));
        System.out.println("Emergency: $" + services.calculateFee("Trauma"));
        System.out.println("\n");

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("============================");

        Pet[] pets = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Bird("Tweety", 1)
        };

        for (Pet pet : pets) {
            pet.displayInfo();
            pet.makeSound();
            if(pet != pets[pets.length - 1]) System.out.println();
        }
        System.out.println("\n");

        System.out.println("Training Session Started!");
        System.out.println("======================");

        for (Pet pet : pets) {
            if (pet instanceof Trainable) {
                ((Trainable) pet).performTrick();
            }
        }
    }
}

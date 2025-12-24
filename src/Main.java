public class Main {

    public static void main(String[] args) {

        System.out.println("=== Veterinary Clinic Management System ===\n");

        Pet pet1 = new Pet(1, "Haski", "Dog", 2, "Alisher");
        Pet pet2 = new Pet(2, "Violet", "Cat", 5, "Abilmansur");
        Pet pet3 = new Pet(3, "Bobik", "Dog", 1, "Ismail");

        Owner owner1 = new Owner(101, "Alisher", "87759274772", 1, false);
        Owner owner2 = new Owner(102, "Abilmansur", "87088394623", 1, false);
        Owner owner3 = new Owner(103, "Ismail", "87753130875", 1, false);

        Veterinarian vet1 = new Veterinarian(201, "Dr.Adil", "Dog", 7, true);
        Veterinarian vet2 = new Veterinarian(202, "Dr.Sayat ", "Cat", 4, true);

        System.out.println("--- PETS ---");
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        System.out.println("\n--- OWNERS ---");
        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);

        System.out.println("\n--- VETERINARIANS ---");
        System.out.println(vet1);
        System.out.println(vet2);

        System.out.println("\n--- METHODS ---");
        System.out.println(pet3.getName() + " is young: " + pet3.isYoung());
        owner1.addPet();
        owner1.addPet();
        System.out.println(owner1.getName() + " VIP: " + owner1.isVIP());
        System.out.println(vet1.getName() + " experienced: " + vet1.isExperienced());

        System.out.println("\n=== Program Complete ===");
    }
}
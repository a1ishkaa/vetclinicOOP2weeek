import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> people = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== VETERINARY CLINIC SYSTEM ===");
            System.out.println("1. Add Owner");
            System.out.println("2. Add Veterinarian");
            System.out.println("3. View All People");
            System.out.println("4. Demonstrate Polymorphism");
            System.out.println("5. View Veterinarians Only");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addOwner();
                case 2 -> addVeterinarian();
                case 3 -> viewAll();
                case 4 -> demonstratePolymorphism();
                case 5 -> viewVetsOnly();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option!");
            }

        } while (choice != 0);
    }

    static void addOwner() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Number of pets: ");
        int pets = scanner.nextInt();

        people.add(new Owner(id, name, phone, pets));
        System.out.println("Owner added!");
    }

    static void addVeterinarian() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Specialization: ");
        String spec = scanner.nextLine();

        System.out.print("Experience years: ");
        int exp = scanner.nextInt();

        people.add(new Veterinarian(id, name, phone, spec, exp));
        System.out.println("Veterinarian added!");
    }

    static void viewAll() {
        if (people.isEmpty()) {
            System.out.println("No data.");
            return;
        }

        for (Person p : people) {
            System.out.println(p);
        }
    }

    static void demonstratePolymorphism() {
        System.out.println("\n--- POLYMORPHISM DEMO ---");
        for (Person p : people) {
            p.work();
        }
    }

    static void viewVetsOnly() {
        System.out.println("\n--- VETERINARIANS ---");
        for (Person p : people) {
            if (p instanceof Veterinarian) {
                Veterinarian v = (Veterinarian) p;
                System.out.println(v);
                System.out.println("Experienced: " + v.isExperienced());
            }
        }
    }
}

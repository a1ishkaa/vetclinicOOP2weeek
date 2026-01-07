public class Veterinarian extends Person {

    private String specialization;
    private int experienceYears;

    public Veterinarian(int id, String name, String phone,
                        String specialization, int experienceYears) {
        super(id, name, phone);
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    public boolean isExperienced() {
        return experienceYears >= 5;
    }

    public boolean canTreat(String animalType) {
        return specialization.equalsIgnoreCase(animalType)
                || specialization.equalsIgnoreCase("General");
    }

    @Override
    public String getRole() {
        return "Veterinarian";
    }

    @Override
    public void work() {
        System.out.println("Dr. " + name + " is treating animals.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Specialization: " + specialization +
                ", Experience: " + experienceYears + " years";
    }
}

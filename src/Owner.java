public class Owner extends Person {

    private int numberOfPets;
    private boolean vip;

    public Owner(int id, String name, String phone, int numberOfPets) {
        super(id, name, phone);
        this.numberOfPets = numberOfPets;
        this.vip = numberOfPets >= 3;
    }

    public void addPet() {
        numberOfPets++;
        if (numberOfPets >= 3) {
            vip = true;
        }
    }

    public boolean isVIP() {
        return vip;
    }

    @Override
    public String getRole() {
        return "Owner";
    }

    @Override
    public void work() {
        System.out.println(name + " takes care of pets.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Pets: " + numberOfPets +
                ", VIP: " + vip;
    }
}

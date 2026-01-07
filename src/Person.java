public class Person {

    protected int id;
    protected String name;
    protected String phone;

    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return "Person";
    }

    public void work() {
        System.out.println(name + " is doing general work.");
    }

    @Override
    public String toString() {
        return "[" + getRole() + "] " + name + " (ID: " + id + ")";
    }
}
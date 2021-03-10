package p62;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animal() {
        this.name = "Horse";
        this.age = 4;
        this.weight = 100;
    }

    public void ride() {
        System.out.println("Ride a horse");
    }
}

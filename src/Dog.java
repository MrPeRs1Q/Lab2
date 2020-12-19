public class Dog {
    private String name;
    private int age;

    public Dog(int age, String name) {
        this.name = name;
        this.age = age * 7;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

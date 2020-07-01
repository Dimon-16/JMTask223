package web.model;

public class Car {
    private String model;
    private int age;
    private int maxSpeed;

    public Car() {

    }

    public Car(String name, int age, int maxSpeed) {
        model = name;
        this.age = age;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

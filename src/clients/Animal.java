package clients;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", owner=" + owner;
    }
}

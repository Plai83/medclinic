package clients.imlp;

import clients.Animal;
import clients.Flyable;
import clients.Owner;

import java.time.LocalDate;

public class Bird extends Animal implements Flyable {
    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public boolean fly() {
        return true;
    }
}

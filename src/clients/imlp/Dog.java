package clients.imlp;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public boolean run() {
        return true;
    }
}

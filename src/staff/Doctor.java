package staff;

import java.time.LocalDate;

public class Doctor extends Staff{
    public Doctor(String name, LocalDate age, String speciality) {
        super(name, age, speciality);
    }

    public void therapy (String name) {
        System.out.println(name + " лечение началось, доктор " + this.name);
    }
}

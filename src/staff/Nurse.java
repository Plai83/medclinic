package staff;

import java.time.LocalDate;

public class Nurse extends Staff{
    public Nurse(String name, LocalDate age, String speciality) {
        super(name, age, speciality);
    }

    public void injection (String name) {
        System.out.println(name + " сделали укол, медсестра " + this.name);
    }
}

package staff;

import java.time.LocalDate;

public class Nurse extends Staff{
    public Nurse(String name, LocalDate age, String speciality, String jobTitle) {
        super(name, age, speciality, jobTitle);
    }

    public void injection (String name) {
        System.out.println(name + " сделали укол, медсестра " + this.name);
    }
}

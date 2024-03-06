package staff;

import java.time.LocalDate;

public class Staff {

    protected String name;
    protected LocalDate age;
    protected String speciality;
    protected String jobTitle;

    public Staff(String name, LocalDate age, String speciality, String jobTitle) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", speciality='" + speciality +
                ", jobTitle='" + jobTitle;
    }

}

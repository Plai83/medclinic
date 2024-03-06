import clients.*;
import clients.imlp.*;
import staff.Doctor;
import staff.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class VeterinaryClinic {

    private List<Animal> listСlients = new ArrayList<>();
    private List<Doctor> listDoc = new ArrayList<>();
    private List<Nurse> listNurse = new ArrayList<>();
    String address;
    String openingHours;

    public VeterinaryClinic() {
        address = "Сенная площадь, 2, Санкт-Петербург";
        openingHours = "Будни 9:00 - 21:00 / Выходные не работает";
        clientsClinics();
        StaffClinics();
        clinicWork();
    }

    public void StaffClinics() {
        Doctor bob = new Doctor("Боб", LocalDate.now(), "Хирургия");
        addEmployeeDoc(bob);
        Doctor haus = new Doctor("Хаус", LocalDate.now(), "Диагност");
        addEmployeeDoc(haus);
        Nurse dahsa = new Nurse("Даша", LocalDate.now(), "Хирургия");
        addEmployeeNurse(dahsa);
        Nurse alisa = new Nurse("Алиса", LocalDate.now(), "Диагностическое отделение");
        addEmployeeNurse(alisa);

    }

    public void clientsClinics() {
        Animal rada = new Dog("Рада", 7, LocalDate.now(), new Owner());
        addClients(rada);
        Animal kaa = new Snake("Каа", 12, LocalDate.now(), new Owner());
        addClients(kaa);
        Animal gupy = new Fish("Гупи", 0.01f, LocalDate.now(), new Owner());
        addClients(gupy);
        Animal leva = new Lion("Лева", 27, LocalDate.now(), new Owner());
        addClients(leva);
        Animal arrow = new Bird("Стрелка", 27, LocalDate.now(), new Owner());
        addClients(arrow);
        Animal bety = new Dog("Бети", 11, LocalDate.now(), new Owner());
        addClients(bety);
    }

    public void clinicWork() {
        getAddress();
        getOpeningHours();
        getAllСlients();
        clientsFlying();
        clientsWalking();
        clientsFloating();
        getAllStaff();

        listNurse.get(0).injection("Лева");
        listDoc.get(0).therapy("Лева");


        extractClient("Лева");
        getAllСlients();
        clientsFlying();
        clientsWalking();
        clientsFloating();

    }

    private void addEmployeeDoc(Doctor doc) {
        // Добавление работника в список докторов
        listDoc.add(doc);
    }

    private void addEmployeeNurse(Nurse nurse) {
        // Добавление работника в список медсестер
        listNurse.add(nurse);
    }

    public void getAllStaff() {
        // Вывод списка персонала
        System.out.println(listDoc);
        System.out.println(listNurse);
    }


    private void addClients(Animal animal) {
        // Добавление клиента в список пациентов
        listСlients.add(animal);
    }

    public void getAllСlients() {
        // Вывод списка пациентов
        System.out.println(listСlients);
    }

    public void clientsFlying() {
        // Вывод списка летающих пациентов
        for (Animal animal : listСlients) {
            if (animal instanceof Flyable) {
                System.out.println(animal);
            }
        }
    }

    public void clientsWalking() {
        // Вывод списка ходячих пациентов
        for (Animal animal : listСlients) {
            if (animal instanceof Goable) {
                System.out.println(animal);
            }
        }
    }

    public void clientsFloating() {
        // Вывод списка плавающих пациентов
        for (Animal animal : listСlients) {
            if (animal instanceof Swimable) {
                System.out.println(animal);
            }
        }
    }

    public void extractClient(String name) {
        // Выписка пациента
        boolean flag = true;
        for (int i = 0; i < listСlients.size(); i++){
            if(name.equals(listСlients.get(i).getName())) {
                System.out.printf("Пациент %s выписан\n", listСlients.get(i).getName());
                listСlients.remove(listСlients.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.printf("Пациента с именем %s нет в поликлинике\n", name);
        }
    }

    public void getAddress() {
        System.out.printf("Наш адрес: %s\n", address);
    }

    public void getOpeningHours() {
        System.out.printf("Часы работы: %s\n", openingHours);
    }

}

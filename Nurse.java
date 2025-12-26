package models;



public class Nurse extends Staff implements Soignant{


    private Doctor superieur;


    public Nurse(String firstName ,String lastName,String phone,double salary,Doctor superieur){

        super(firstName, lastName, phone, salary);
        this.superieur=superieur;

    }

    public Doctor getsuperieur() {
        return superieur;
    }

    @Override
    public void displayInfo() {

        System.out.println(String.format(        
        "==== NURSE ====\n" +
        "First name: %s\n" +
        "Last name: %s\n" +
        "ID: %d\n" +
        "phone: %s\n" +
        "salary: %.2f\n" +
        "superieur: Dr %s",
        getFirstName(),
        getLastName(),
        getId(),
        getPhone(),
        getSalary(),
        this.superieur.getLastName()
        ));
        
    }
    @Override
    public void soigner(Patient p){

        System.out.println("Nurse "+this.getLastName()+" provide care to patient "+ p.getLastName()+" with "+p.getIllness());
        p.setGotCare();

        }

    
}
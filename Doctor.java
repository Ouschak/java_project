package models;



public class Doctor extends Staff implements Soignant{


    private String speciality;


    public Doctor(String firstName ,String lastName,String phone,double salary,String speciality){

        super(firstName, lastName, phone, salary);
        this.speciality=speciality;

    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public void displayInfo() {

        System.out.println(String.format(        
        "==== DOCTOR ====\n" +
        "First name: %s\n" +
        "Last name: %s\n" +
        "ID: %d\n" +
        "phone: %s\n" +
        "salary: %.2f\n" +
        "specialty: %s",
        getFirstName(),
        getLastName(),
        getId(),
        getPhone(),
        getSalary(),
        this.speciality
        ));

    }
    
    @Override
    public void soigner(Patient p){

        System.out.println("Dr "+this.getLastName()+" provide care to patient "+ p.getLastName()+" with "+p.getIllness());
        p.setGotCare();

        }
        
    

    
}
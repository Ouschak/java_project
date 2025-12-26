package models;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person{


    private String illness;
    private List <String> symptoms = new ArrayList<String>();
    private boolean emergency;
    private boolean gotCare=false;


    public Patient(String firstName ,
        String lastName,
        String illness,
        List<String> symptoms, 
        boolean emergency)
        {

        super(firstName, lastName);
        this.illness=illness;
        this.symptoms=List.copyOf(symptoms);
        this.emergency=emergency;
    }

    @Override
    public void displayInfo(){

        System.out.println(String.format(        
        "==== Patient ====\n" +
        "First name: %s\n" +
        "Last name: %s\n" +
        "ID: %d\n" +
        "illness: %s\n" +
        "Symptoms: %s\n" +
        "EMERGENCY: %s",
        "GotCare: %s",
        getFirstName(),
        getLastName(),
        getId(),
        this.illness,
        this.symptoms,
        this.emergency ? "YES" : "NO",
        this.gotCare ? "YES" : "NO"
    ));
}
    public String getIllness() {
        return illness;
    }
    public List<String> getSymptoms() {
        return this.symptoms;
    }

    public boolean getEmergency(){
        return emergency;
    }
    public void setGotCare(){

        this.gotCare=true;


    }

    }






     

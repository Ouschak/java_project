package models;


public abstract class Person {


    private static int nextID=1;


    private final int id;
    private String firstName;
    private String lastName;


    protected Person(String firstName ,String lastName){
        setName(firstName,lastName);
        this.id=nextID++;


    }
    
    protected final void setName(String firstName,String lastName){

        this.firstName=validateName(firstName,"first name");
        this.lastName=validateName(lastName,"last name");
        

    }

    private static String validateName(String value,String name){

        if (value==null){
            throw new IllegalArgumentException(name + " can't be null");
        }

        String trimmed= value.trim();

        if (trimmed.isEmpty()){
            throw new IllegalArgumentException(name + " can't be empty");
        }
        
        if (trimmed.length()<2){
            throw new IllegalArgumentException(name + " can't be one letter");
        }
        if (!trimmed.matches("[\\p{L} -]+")){
            throw new IllegalArgumentException(name + " can only contain a valid letters");
        }

        return trimmed;

    }

    public abstract void displayInfo();


    public String getFirstName() {
        return this.firstName;
    }

    public int getId() {
        return this.id;
    }
    public String getLastName() {
        return this.lastName;
    }
    


}
